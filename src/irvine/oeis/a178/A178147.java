package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178147 Sum of squares d^2 of distinct divisors of n, d in <code>{2, 3, 5}</code>.
 * @author Sean A. Irvine
 */
public class A178147 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178147() {
    super(new long[] {1, 2, 2, 1, 0, -1, -2, -2}, new long[] {0, 4, 9, 4, 25, 13, 0, 4});
  }
}
