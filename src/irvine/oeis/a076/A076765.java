package irvine.oeis.a076;

import irvine.oeis.LinearRecurrence;

/**
 * A076765 Partial sums of Chebyshev sequence <code>S(n,8) = U(n,4) = A001090(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A076765 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076765() {
    super(new long[] {1, -9, 9}, new long[] {1, 9, 72});
  }
}
