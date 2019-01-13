#!/bin/bash
#
# Perform the first steps in an Alonso sequence factorization using Magma
#
n=$1
if [ "$n" == "" ]; then
    echo "Usage $0 n"
    exit
fi
verbose=$2
s=0
echo "# Factorizations of Alonso sequence starting with $n." >alonso.tmp
echo "${s} ${n}" >>alonso.tmp
while :; do
    if [ -n "$verbose" ]; then
        cat alonso.tmp
    fi
    last=$(cat <alonso.tmp | tail -1 | gawk '{print $NF}')
    if echo "${last}" | grep '('; then
        echo "Too hard ${n}"
        break
    fi
    if [ ${s} -gt 0 ] && ! echo "${last}" | grep -q '[.^]'; then
       break
    fi
    s=$((s+1))
    target=$(echo "${last}" | tr -d '.^')
    if [ ${#target} -lt 80 ]; then
        f=$(echo "SetColumns(0); Factorization($target);" | magma -b | sed 's/\[ *//;s/ *\]//;s/, 1>/>/g;s/<\([0-9]*\), \([0-9]*\)>/<\1^\2>/g;s/, </</g;s/<//g;s/>$//;s/>/./g')
        echo "${s} ${f}" >>alonso.tmp
    else
        echo "Too hard ${n}"
        break
    fi
done
echo "${n} ${target}"
