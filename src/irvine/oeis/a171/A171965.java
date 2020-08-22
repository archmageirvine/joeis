package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171965 Partial sums of floor(n^2/6) (A056827).
 * @author Sean A. Irvine
 */
public class A171965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171965() {
    super(new long[] {-1, 3, -3, 1, 0, 0, 1, -3, 3}, new long[] {0, 0, 0, 1, 3, 7, 13, 21, 31});
  }
}
