package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077412 Chebyshev U(n,x) polynomial evaluated at <code>x=8</code>.
 * @author Sean A. Irvine
 */
public class A077412 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077412() {
    super(new long[] {-1, 16}, new long[] {1, 16});
  }
}
