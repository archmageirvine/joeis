package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089599 G.f.: <code>(1+x^5+x^7+x^8+x^10+x^15)/((1-x^2)(1-x^3)(1-x^4)(1-x^6)^2(1-x^9))</code>.
 * @author Sean A. Irvine
 */
public class A089599 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089599() {
    super(new long[] {-1, 1, 1, 0, 0, -2, 1, -1, 0, 2, -2, 1, 0, 0, 1, -2, 2, 0, -1, 1, -2, 0, 0, 1, 1}, new long[] {1, 0, 1, 1, 2, 2, 5, 4, 8, 9, 13, 15, 23, 24, 35, 40, 52, 60, 79, 87, 112, 127, 155, 177, 216});
  }
}
