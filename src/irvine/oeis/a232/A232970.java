package irvine.oeis.a232;

import irvine.oeis.LinearRecurrence;

/**
 * A232970 G.f.: (1-3*x)/(1-5*x+3*x^2+x^3).
 * @author Sean A. Irvine
 */
public class A232970 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232970() {
    super(new long[] {-1, -3, 5}, new long[] {1, 2, 7});
  }
}
