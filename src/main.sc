require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Душный Начало.
        a: Можешь написать: Миша, душный, заебал.
        event: noMatch || toState = "./"

    state: Misha
        q!: Миша
        a: душный
        
    state: Dushniy
        q!: душный
        a: Миша
        
    state: Zaebal
        q!: заебал
        a: Пошел наух
        a: https://docs.google.com/spreadsheets/d/1XWggl5WJlO9kqlkTz2krlvSoitkJXmcQfFIcUyAnTxU/edit#gid=0https://docs.google.com/spreadsheets/d/1XWggl5WJlO9kqlkTz2krlvSoitkJXmcQfFIcUyAnTxU/edit#gid=0
        a: 89114346581 Tink

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: Миша Душный
