package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134630 <code>5*n^5 - 3*n^3 - 2*n^2</code>. Coefficients and exponents are the prime numbers in decreasing order.
 * @author Sean A. Irvine
 */
public class A134630 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134630() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 0, 128, 1116, 4896, 15200});
  }
}
