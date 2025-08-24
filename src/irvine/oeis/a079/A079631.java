package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079618.
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

