#!/bin/bash
#
# Try and get 260 characters of data for a sequence.  Makes assumptions
# about classpath and similar.

a=${1}
if [[ ${a} = "" ]]; then
    echo "Usage: $0 A-number"
    exit
fi
target=${2:-260}
res=
java irvine.oeis.SequenceFactory "${a}" | while read term; do
    len=$((${#res}+${#term}+2))
    if [[ ${len} -gt ${target} ]]; then
        echo "${res}"
        break
    fi
    if [[ ${res} = "" ]]; then
        res=${term}
    else
        res="${res}, ${term}"
    fi
done

