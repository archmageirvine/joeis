#!/bin/bash
#
# Make a graph of EM sequence steps

GNUPLOT=gnuplot

cat >.em.plot <<EOF
set term png
set output "em.png"
set xlabel "step"
set ylabel "digits"
set title "Euclid-Mullin digits"
set style data lines
EOF

first=true
echo -n "plot " >>.em.plot
for f in em[0-9] em[0-9][0-9]; do
    echo ${f}
    out=.${f}.dat
    n=${f##em}
    java irvine.factor.project.em.EMVerify -s <${f} | grep '^[0-9]' >${out}
    if [ "$first" = true ]; then
        first=false
    else
        echo -n , >>.em.plot
    fi
    echo -n "\"$out\" title \"$n\"" >>.em.plot
done
echo >>.em.plot

cat >>.em.plot <<EOF
unset output
EOF

cat .em.plot | ${GNUPLOT}

/bin/rm -f emsmallest.dat >&/dev/null
for f in em[0-9]*[^~]; do
    echo ${f}
    java irvine.factor.project.em.EMVerify <${f} >.${f}.t
    v=$(grep 'Small' <.${f}.t | tr -d -c '0123456789 \n' | tr -s ' ' ' ')
    w=$(grep '^#Current' <.${f}.t | tr -d -c '0123456789\n' | tr -s ' ' ' ')
    oeis=$(grep 'This is A' <${f} | gawk '{print $4}')
    echo ${f##em} ${v} ${#w} ${oeis} >>emsmallest.dat
    /bin/rm -f .${f}.t >&/dev/null
done
echo "#start first-p-not-in-sequence current-step-number size-of-composite OEIS" >.emsmallest.dat
sort -n <emsmallest.dat >>.emsmallest.dat
mv .emsmallest.dat emsmallest.dat

/bin/rm -f .em*.dat .em.plot
