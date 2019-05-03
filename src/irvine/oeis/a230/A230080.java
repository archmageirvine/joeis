package irvine.oeis.a230;

import irvine.oeis.LinearRecurrence;

/**
 * A230080 Sequence needed for the nonpositive powers of <code>rho(11) = 2*cos(Pi/11)</code> in terms of the power basis of the degree 5 number field <code>Q(rho(11))</code>. Coefficients of the first power.
 * @author Sean A. Irvine
 */
public class A230080 extends LinearRecurrence {

  /** Construct the sequence. */
  public A230080() {
    super(new long[] {1, -1, -4, 3, 3}, new long[] {0, 3, 5, 23, 73});
  }
}
