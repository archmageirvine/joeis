package irvine.oeis.a034;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A034661 Sum of n-th powers of divisors of 18.
 * @author Sean A. Irvine
 */
public class A034661 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034661() {
    super(new long[] {-5832, 12636, -9594, 3285, -533, 39}, new long[] {6, 39, 455, 6813, 112931, 1956669});
  }
}
