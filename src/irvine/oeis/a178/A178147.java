package irvine.oeis.a178;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A178147 Sum of squares d^2 of distinct divisors of n, d in {2, 3, 5}.
 * @author Sean A. Irvine
 */
public class A178147 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178147() {
    super(1, new long[] {1, 2, 2, 1, 0, -1, -2, -2}, new long[] {0, 4, 9, 4, 25, 13, 0, 4});
  }
}
