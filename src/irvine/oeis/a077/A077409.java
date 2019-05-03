package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077409 Bisection (even part) of Chebyshev sequence with Diophantine property.
 * @author Sean A. Irvine
 */
public class A077409 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077409() {
    super(new long[] {-1, 10}, new long[] {7, 59});
  }
}
