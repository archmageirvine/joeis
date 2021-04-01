#!/bin/bash
#
# Plot a graph of the proportion of sequences done in each bucket of 1000.
# Also produce a heat map with one pixel per sequence showing those implemented.

max=350

DEAD=src/irvine/oeis/dead.lst

for bucket in $(seq 0 ${max}); do
    b="00${bucket}"
    b=${b: -3}
    dead=$(grep -c "^A${b}" "${DEAD}")
    if [[ -d src/irvine/oeis/a${b} ]]; then
        impl=$(find "src/irvine/oeis/a${b}" -name "A${b}[0-9][0-9][0-9].java" | wc -l)
    else
        impl=0
    fi
    echo "${b} $((impl+dead))"
done >oeis_done.dat

gnuplot <<EOF
   set term pngcairo size 900,500
   set output "oeis-done.png"
   set xlabel "Sequence Bin"
   set ylabel "Implemented"
   set yrange [0:1000]
   set tics out
   set title "Implemented OEIS Sequences (bins of 1000 sequences)"
   plot "oeis_done.dat" using 1:2 with impulses title "Total Implemented"
EOF

# A heat map view showing red for dead sequences and green for implmented
{
    sed 's/^A0*//' <"${DEAD}" | while read dead; do
        echo "$((dead/1000)) $((dead%1000)) r"
    done
    for bucket in $(seq 0 ${max}); do
        b="00${bucket}"
        b=${b: -3}
        if [[ -d src/irvine/oeis/a${b} ]]; then
            find "src/irvine/oeis/a${b}" -name "A${b}[0-9][0-9][0-9].java" | sed 's/.*A0*//;s/\.java//' | while read impl; do
                echo "${impl}"
                echo "$((impl/1000)) $((impl%1000)) g"
            done
        fi
    done
} | awk -vmax=${max} '{pix[$1,$2]=$3}END{print "P6 1000 "max" 1"; for (y=0;y<max;y++) for(x=0; x<1000;x++) {val=pix[y,x]; if (val=="r") {printf "%c%c%c", 1, 0, 0} else if (val=="g") {printf "%c%c%c", 0, 1, 0} else {printf "%c%c%c", 0, 0, 0 }}}' | pnmtopng >oeis-implemented.png

gnuplot <<EOF
        set term pngcairo
        set output "oeis-history.png"
        set xlabel "Year (20xx)"
        set ylabel "Sequences implemented"
        set title "History of jOEIS"
        set xdata time     
        #set xtics 63072000
        set timefmt "%Y-%m-%d"
        set format x "%y"
        set key off
        plot "history.dat" using 1:2 with lines
EOF

mv ./*.png doc
