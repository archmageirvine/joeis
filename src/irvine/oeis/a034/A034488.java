package irvine.oeis.a034;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A034488 Sum of n-th powers of divisors of 6.
 * @author Sean A. Irvine
 */
public class A034488 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034488() {
    super(new long[] {-36, 72, -47, 12}, new long[] {4, 12, 50, 252});
  }
}
