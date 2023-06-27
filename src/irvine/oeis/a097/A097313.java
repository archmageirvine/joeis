package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097313 Chebyshev polynomials of the second kind, U(n,x), evaluated at x=15.
 * @author Sean A. Irvine
 */
public class A097313 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097313() {
    super(-1, new long[] {-1, 30}, new long[] {0, 1});
  }
}
