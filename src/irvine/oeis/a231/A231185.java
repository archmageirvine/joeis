package irvine.oeis.a231;

import irvine.oeis.LinearRecurrence;

/**
 * A231185 Coefficients of the nonnegative powers of <code>rho(11) = 2*cos(Pi/11)</code> when written in the power basis of the degree 5 number field <code>Q(rho(11))</code>. Coefficients of the third power.
 * @author Sean A. Irvine
 */
public class A231185 extends LinearRecurrence {

  /** Construct the sequence. */
  public A231185() {
    super(new long[] {1, -3, -3, 4, 1}, new long[] {1, 0, 4, 1, 14});
  }
}
