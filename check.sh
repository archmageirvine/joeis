#!/bin/bash
#
# Report on various state of implementaitons.

DEAD=src/irvine/oeis/dead.lst
NOT_DONE=notdone.dat

echo "Checking for implementations without tests"
find src/irvine/oeis -name "A[0-9][0-9][0-9][0-9][0-9][0-9].java" | while read s; do
    t=${s/src/test}
    t=${t/.java/Test.java}
    a=${s##*/}
    a=${a%.java}
    [[ -r ${t} ]] || grep -q "${a}" "${NOT_DONE}" || grep -q "${a}" "${DEAD}" || ./make_oeis_test.sh "${a}"
done

echo "Checking for implementations of dead sequences"
find src/irvine/oeis -name "A[0-9][0-9][0-9][0-9][0-9][0-9].java" | grep -F -f "${DEAD}"

echo "First unimplemented sequences"
{
    find src/irvine/oeis -name "A[0-9][0-9][0-9][0-9][0-9][0-9].java" | sed 's%.*/%%;s%.java%%'
    awk '/^A/{print $1}' <"${NOT_DONE}"
    cat "${DEAD}"
} | sort | uniq | awk 'BEGIN{b=0}{b=b+1;c=$0; gsub("A0*","",c); while (b != c) {a=sprintf("A%06d",b); print a; b=b+1;}}' | head -5

