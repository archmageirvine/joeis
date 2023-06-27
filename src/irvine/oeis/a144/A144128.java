package irvine.oeis.a144;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A144128 Chebyshev U(n,x) polynomial evaluated at x=18.
 * @author Sean A. Irvine
 */
public class A144128 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144128() {
    super(1, new long[] {-1, 36}, new long[] {1, 36});
  }
}
