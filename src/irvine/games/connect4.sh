#!/bin/bash
#
# Count Connect 4 configurations: A212693, A013582.

echo "000000000000000000000000" >0.dat

mover=2
for move in {1..42}; do
    mover=$((3-mover))
    if [[ ! -r ${move}.dat ]] && [[ ! -r ${move}.dat.gz ]]; then
        java irvine.game.Connect4 ${mover} <"$((move-1)).dat" | sort -T . | uniq >"${move}.dat"
        echo "${move} $(wc -l <${move}.dat) $(grep -c '<' <${move}.dat)"
    fi
done
