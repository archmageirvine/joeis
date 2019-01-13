#!/bin/bash
for x in *.helper; do
  echo ${x%.helper}
  echo
  java irvine.factor.project.fibonacci.FibonacciSpectrum ${x%.helper} ${x} summary
  echo
done
