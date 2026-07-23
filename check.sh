#!/bin/bash
#
# Report first unimplemented sequences (excluding those in notdone.dat).

NOT_DONE=notdone.dat

# This line checks for implementations in the wrong package
find src/irvine/oeis/a* -type f | grep .java | grep -v '\([0-9][0-9][0-9]\)/A\1'

echo "First unimplemented sequences"
{
    find src/irvine/oeis -name "A[0-9][0-9][0-9][0-9][0-9][0-9].java" | sed 's%.*/%%;s%.java%%'
    awk '/^A/{print $1}' <"${NOT_DONE}"
} | sort | uniq | awk 'BEGIN{b=0}{b=b+1;c=$0; gsub("A0*","",c); while (b != c) {a=sprintf("A%06d",b); print a; b=b+1;}}' | head -5
