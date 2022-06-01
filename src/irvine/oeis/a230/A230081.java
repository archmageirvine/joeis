package irvine.oeis.a230;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A230081 Sequence needed for the nonpositive powers of rho(11) = 2*cos(Pi/11) in the power basis of the degree 5 number field Q(rho(11)). Negative of the coefficients of the second power.
 * @author Sean A. Irvine
 */
public class A230081 extends LinearRecurrence {

  /** Construct the sequence. */
  public A230081() {
    super(new long[] {1, -1, -4, 3, 3}, new long[] {0, 4, 13, 50, 173});
  }
}
