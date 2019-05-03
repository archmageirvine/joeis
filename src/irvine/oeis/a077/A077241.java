package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077241 Combined Diophantine Chebyshev sequences <code>A054488</code> and <code>A077413</code>.
 * @author Sean A. Irvine
 */
public class A077241 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077241() {
    super(new long[] {-1, 0, 6, 0}, new long[] {1, 2, 8, 13});
  }
}
