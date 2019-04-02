package irvine.oeis.a231;

import irvine.oeis.LinearRecurrence;

/**
 * A231182 Coefficients for the nonnegative powers of rho(11) = 2*cos(Pi/11) when written in the power basis of the degree 5 number field Q(rho(11)). Coefficients for the zeroth and fourth powers.
 * @author Sean A. Irvine
 */
public class A231182 extends LinearRecurrence {

  /** Construct the sequence. */
  public A231182() {
    super(new long[] {1, -3, -3, 4, 1}, new long[] {1, 0, 0, 0, 0});
  }
}
