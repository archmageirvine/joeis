package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178143 Sum of squares d^2 over the divisors d=2 and/or d=3 of n.
 * @author Sean A. Irvine
 */
public class A178143 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178143() {
    super(new long[] {1, 1, 0, -1}, new long[] {0, 4, 9, 4});
  }
}
