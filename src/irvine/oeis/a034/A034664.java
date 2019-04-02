package irvine.oeis.a034;

import irvine.oeis.LinearRecurrence;

/**
 * A034664 Sum of n-th powers of divisors of 24.
 * @author Sean A. Irvine
 */
public class A034664 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034664() {
    super(new long[] {-331776, 829440, -792000, 383040, -103348, 15960, -1375, 60}, new long[] {8, 60, 850, 16380, 358258, 8253300, 194402650, 4624699020L});
  }
}
