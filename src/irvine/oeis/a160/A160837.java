package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160837 G.f.: <code>(1+38*x+262*x^2+475*x^3+254*x^4+37*x^5+x^6)/(1-x)^7</code>.
 * @author Sean A. Irvine
 */
public class A160837 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160837() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 45, 556, 3457, 14317, 45565, 120772});
  }
}
