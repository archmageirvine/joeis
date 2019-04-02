package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123893 G.f.: -(1+x^2)*(1+2*x^2)*(1+3*x^2)/(-1-6*x^2-11*x^4-6*x^6+4*x+18*x^3+22*x^5+6*x^7).
 * @author Sean A. Irvine
 */
public class A123893 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123893() {
    super(new long[] {6, -6, 22, -11, 18, -6, 4}, new long[] {1, 4, 16, 58, 208, 750, 2708});
  }
}
