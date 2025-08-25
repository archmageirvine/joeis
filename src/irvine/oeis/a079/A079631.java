package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079631 Number of k less than or equal to n such that floor(k^(1/3)) divides k.
 * @author Sean A. Irvine
 */
public class A079631 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final long c = Functions.CBRT.l(mN);
    return Z.valueOf(mN / c + (c * c + 5 * c) / 2 - 3);
  }
}

