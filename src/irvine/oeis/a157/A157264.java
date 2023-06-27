package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157264 a(n) = 10368*n^2 - 15840*n + 6049.
 * @author Sean A. Irvine
 */
public class A157264 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157264() {
    super(1, new long[] {1, -3, 3}, new long[] {577, 15841, 51841});
  }
}
