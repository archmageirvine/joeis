package irvine.oeis.a034;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A034667 Sum of n-th powers of divisors of 40.
 * @author Sean A. Irvine
 */
public class A034667 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034667() {
    super(new long[] {-2560000, 5760000, -4712000, 1864800, -396564, 46620, -2945, 90}, new long[] {8, 90, 2210, 73710, 2734994, 105736950, 4161281930L, 165132191790L});
  }
}
