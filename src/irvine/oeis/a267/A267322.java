package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267322 Expansion of <code>(1 + x + x^2 + x^4 + 2*x^5)/(1 - x^3)^3</code>.
 * @author Sean A. Irvine
 */
public class A267322 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267322() {
    super(new long[] {1, 0, 0, -3, 0, 0, 3, 0, 0}, new long[] {1, 1, 1, 3, 4, 5, 6, 9, 12});
  }
}
