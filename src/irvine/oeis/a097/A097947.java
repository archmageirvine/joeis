package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097947 G.f.: <code>(2+7*x+2*x^2)/((x^2-1)*(1+4*x+x^2))</code>.
 * @author Sean A. Irvine
 */
public class A097947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097947() {
    super(new long[] {1, 4, 0, -4}, new long[] {-2, 1, -6, 16});
  }
}
