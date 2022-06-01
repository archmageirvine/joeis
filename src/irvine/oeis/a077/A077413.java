package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077413 Bisection (odd part) of Chebyshev sequence with Diophantine property.
 * @author Sean A. Irvine
 */
public class A077413 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077413() {
    super(new long[] {-1, 6}, new long[] {2, 13});
  }
}
