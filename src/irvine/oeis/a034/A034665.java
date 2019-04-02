package irvine.oeis.a034;

import irvine.oeis.LinearRecurrence;

/**
 * A034665 Sum of n-th powers of divisors of 32.
 * @author Sean A. Irvine
 */
public class A034665 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034665() {
    super(new long[] {-32768, 64512, -41664, 11160, -1302, 63}, new long[] {6, 63, 1365, 37449, 1118481, 34636833});
  }
}
