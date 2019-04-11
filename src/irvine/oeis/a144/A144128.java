package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144128 Chebyshev U(n,x) polynomial evaluated at <code>x=18</code>.
 * @author Sean A. Irvine
 */
public class A144128 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144128() {
    super(new long[] {-1, 36}, new long[] {1, 36});
  }
}
