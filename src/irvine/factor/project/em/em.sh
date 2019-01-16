#!/bin/bash
#
# Use Magma for Euclid-Mullin sequences.
#
n=$1
if [ "$n" == "" ]; then
    echo "Usage $0 n"
    exit
fi
s=1
echo "# Factorizations of Euclid-Mullin sequence starting with $n." >em.tmp
echo "${s} ${n}" >>em.tmp
while :; do
    s=$((s+1))
    cat em.tmp
    target=$(java irvine/factor/project/em/EMVerify <em.tmp | tail -1 | gawk '{print $NF}')
    if [ ${#target} -lt 80 ]; then
        f=$(echo "SetColumns(0); Factorization($target);" | magma -b | sed 's/\[ *//;s/ *\]//;s/, 1>/>/g;s/<\([0-9]*\), 2>/<\1.\1>/g;s/<\([0-9]*\), 3>/<\1.\1.\1>/g;s/<\([0-9]*\), 4>/<\1.\1.\1.\1>/g;s/<\([0-9]*\), 5>/<\1.\1.\1.\1.\1>/g;s/<\([0-9]*\), 6>/<\1.\1.\1.\1.\1.\1>/g;s/<\([0-9]*\), 7>/<\1.\1.\1.\1.\1.\1.\1>/g;s/<\([0-9]*\), 8>/<\1.\1.\1.\1.\1.\1.\1.\1>/g;s/<\([0-9]*\), 9>/<\1.\1.\1.\1.\1.\1.\1.\1.\1>/g;s/<\([0-9]*\), 10>/<\1.\1.\1.\1.\1.\1.\1.\1.\1.\1>/g;s/<\([0-9]*\), 11>/<\1.\1.\1.\1.\1.\1.\1.\1.\1.\1.\1>/g;s/<\([0-9]*\), 12>/<\1.\1.\1.\1.\1.\1.\1.\1.\1.\1.\1.\1>/g;s/, </</g;s/<//g;s/>$//;s/>/./g')
        echo "${s} ${f}" >>em.tmp
    else
        break
    fi
done

# How to submit
#for x in em[0-9][0-9][0-9][0-9][0-9]; do cat $x | grep -v '^#' | gawk '{print $NF}' | sed 's/\.P.*//' | gawk -F. 'BEGIN{print "SetColumns(0);"; p=""}{if (p=="") {p=1} else {p=p"*"prev}; prev=$1; print "print "p"+1, \"="$0"\";"}' | tr '.' '*' | magma -b; done | tr -d '()' | sed 's/\([=*]\)[0-9]\{1,20\}\*/\1/g;s/\([=*]\)[0-9]\{1,20\}\*/\1/g;s/\([=*]\)[0-9]\{1,20\}\*/\1/g;s/\([=*]\)[0-9]\{1,20\}\*/\1/g' | grep -v '=.\{1,20\}$' | sed 's/=/= /' | gawk '{if ($1!=$3) print;}' | grep -v '^[0-9]\{1,60\} ' >~/bigadd


# Getting lists of smallest composites
#grep '(' ~/joeis/src/irvine/factor/project/em/em[0-9]*[^~] | sed 's/:[0-9]* .*(/ /;s/).*//;s|^.*/||' | gawk '{print length($2),$1,$2}' | sort -rn

#cat ~/joeis/src/irvine/factor/project/em/em[0-9]*[^~] | grep '(\|#' | grep -v -- -- | sed 's/.*(//;s/).*//' | tr '\n' '%' | sed 's/%#/@/g' | tr '%' '\n' | grep -v '@' | gawk '{print length($0),$0}' | sort -rn
