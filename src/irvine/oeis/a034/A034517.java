package irvine.oeis.a034;

import irvine.oeis.LinearRecurrence;

/**
 * A034517 Sum of n-th powers of divisors of 10.
 * @author Sean A. Irvine
 */
public class A034517 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034517() {
    super(new long[] {-100, 180, -97, 18}, new long[] {4, 18, 130, 1134});
  }
}
