package irvine.oeis.a227;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A227139 Chebyshev S-polynomial evaluated at x = 48.
 * @author Sean A. Irvine
 */
public class A227139 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227139() {
    super(new long[] {-1, 48}, new long[] {1, 48});
  }
}
