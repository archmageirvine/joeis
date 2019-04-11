package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097774 Chebyshev U(n,x) polynomial evaluated at <code>x=393=2*14^2+1</code>.
 * @author Sean A. Irvine
 */
public class A097774 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097774() {
    super(new long[] {-1, 786}, new long[] {1, 786});
  }
}
