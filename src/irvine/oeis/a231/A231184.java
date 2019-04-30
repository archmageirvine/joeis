package irvine.oeis.a231;

import irvine.oeis.LinearRecurrence;

/**
 * A231184 Coefficients of the nonnegative powers of <code>rho(11) =</code> 2*cos(Pi/11) when written in the power basis of the degree 5 number field <code>Q(rho(11))</code>. Negative of the coefficients of the second power.
 * @author Sean A. Irvine
 */
public class A231184 extends LinearRecurrence {

  /** Construct the sequence. */
  public A231184() {
    super(new long[] {1, -3, -3, 4, 1}, new long[] {-1, 0, 0, 3, 6});
  }
}
