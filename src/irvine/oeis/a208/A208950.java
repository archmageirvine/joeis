package irvine.oeis.a208;

import irvine.oeis.LinearRecurrence;

/**
 * A208950 <code>a(4*n) = n*(16*n^2-1)/3, a(2*n+1) = n*(n+1)*(2*n+1)/6, a(4*n+2)=(4*n+1)*(4*n+2)*(4*n+3)/6</code>.
 * @author Sean A. Irvine
 */
public class A208950 extends LinearRecurrence {

  /** Construct the sequence. */
  public A208950() {
    super(new long[] {-1, 0, 0, 0, 4, 0, 0, 0, -6, 0, 0, 0, 4, 0, 0, 0}, new long[] {0, 0, 1, 1, 5, 5, 35, 14, 42, 30, 165, 55, 143, 91, 455, 140});
  }
}
