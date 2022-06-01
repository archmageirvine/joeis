package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097765 Chebyshev U(n,x) polynomial evaluated at x=243=2*11^2+1.
 * @author Sean A. Irvine
 */
public class A097765 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097765() {
    super(new long[] {-1, 486}, new long[] {1, 486});
  }
}
