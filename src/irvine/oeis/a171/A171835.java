package irvine.oeis.a171;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A171835 Partial sums of numbers congruent to {3, 4, 5, 6} mod 8 (A047425).
 * @author Sean A. Irvine
 */
public class A171835 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171835() {
    super(new long[] {1, -2, 1, 0, -1, 2}, new long[] {3, 7, 12, 18, 29, 41});
  }
}
