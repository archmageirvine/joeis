package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200862 G.f.: <code>(1-2*x^2)/(1-2*x-5*x^2+9*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A200862 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200862() {
    super(new long[] {-9, 5, 2}, new long[] {1, 2, 7});
  }
}
