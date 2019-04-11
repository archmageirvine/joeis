package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084683 G.f.: <code>(1+2*x^3+2*x^6)/((1-x)*(1-x-x^2+x^3-x^4-x^5+x^6))</code>.
 * @author Sean A. Irvine
 */
public class A084683 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084683() {
    super(new long[] {1, -2, 0, 2, -2, 0, 2}, new long[] {1, 2, 4, 8, 14, 24, 40});
  }
}
