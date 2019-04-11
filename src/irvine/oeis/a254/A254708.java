package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254708 Expansion of <code>(1 + 2*x^2) / (1 - 2*x^2 - x^3 + 2*x^5 + 2*x^6 - x^8 - 2*x^9 + x^11)</code> in powers of x.
 * @author Sean A. Irvine
 */
public class A254708 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254708() {
    super(new long[] {-1, 0, 2, 1, 0, -2, -2, 0, 1, 2, 0}, new long[] {2, 0, 5, 2, 10, 5, 18, 10, 29, 18, 43});
  }
}
