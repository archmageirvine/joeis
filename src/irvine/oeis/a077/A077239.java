package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077239 Bisection (odd part) of Chebyshev sequence with Diophantine property.
 * @author Sean A. Irvine
 */
public class A077239 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077239() {
    super(new long[] {-1, 6}, new long[] {7, 37});
  }
}
