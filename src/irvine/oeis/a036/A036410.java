package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036410 G.f.: <code>(1+x^6)/((1-x)*(1-x^3)*(1-x^4))</code>.
 * @author Sean A. Irvine
 */
public class A036410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036410() {
    super(new long[] {1, -1, -1, 0, 1, 1}, new long[] {1, 1, 1, 2, 3, 3});
  }
}
