package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077244 Bisection (odd part) of Chebyshev sequence with Diophantine property.
 * @author Sean A. Irvine
 */
public class A077244 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077244() {
    super(new long[] {-1, 8}, new long[] {3, 22});
  }
}
