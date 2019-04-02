package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241032 Sum of n-th powers of divisors of 30.
 * @author Sean A. Irvine
 */
public class A241032 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241032() {
    super(new long[] {-810000, 1944000, -1747800, 779760, -190081, 25992, -1942, 72}, new long[] {8, 72, 1300, 31752, 872644, 25170552, 741453700, 22051219752L});
  }
}
