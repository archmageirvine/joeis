package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157364 a(n) = 4802*n^2 - 196*n + 1.
 * @author Sean A. Irvine
 */
public class A157364 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157364() {
    super(new long[] {1, -3, 3}, new long[] {4607, 18817, 42631});
  }
}
