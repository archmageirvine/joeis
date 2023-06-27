package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157730 a(n) = 441*n^2 - 488*n + 135.
 * @author Sean A. Irvine
 */
public class A157730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157730() {
    super(1, new long[] {1, -3, 3}, new long[] {88, 923, 2640});
  }
}
