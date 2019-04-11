package irvine.oeis.a263;

import irvine.oeis.LinearRecurrence;

/**
 * A263694 Expansion of <code>(1 + x + x^2 + x^3 + 4*x^4 - x^5 - x^6 - x^7 + 3*x^8)/((1 - x)^2*(1 + x + x^2 + x^3 + x^4 + x^5 + x^6 + x^7))</code>.
 * @author Sean A. Irvine
 */
public class A263694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263694() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 2, 3, 4, 8, 7, 6, 5, 9});
  }
}
