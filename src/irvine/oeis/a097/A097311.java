package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097311 Chebyshev polynomials of the second kind, U(n,x), evaluated at x=14.
 * @author Sean A. Irvine
 */
public class A097311 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097311() {
    super(new long[] {-1, 28}, new long[] {0, 1});
  }
}
