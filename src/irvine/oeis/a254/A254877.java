package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254877 Expansion of (1 - x^5) / ((1 - x) * (1 - x^2)^2 * (1 - x^3) * (1 - x^4)) in powers of x.
 * @author Sean A. Irvine
 */
public class A254877 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254877() {
    super(new long[] {-1, 0, 2, 1, 0, -2, -2, 0, 1, 2, 0}, new long[] {1, 1, 3, 4, 8, 9, 16, 18, 28, 31, 45});
  }
}
