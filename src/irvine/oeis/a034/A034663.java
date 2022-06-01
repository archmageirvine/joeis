package irvine.oeis.a034;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A034663 Sum of n-th powers of divisors of 21.
 * @author Sean A. Irvine
 */
public class A034663 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034663() {
    super(new long[] {-441, 672, -262, 32}, new long[] {4, 32, 500, 9632});
  }
}
