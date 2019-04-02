package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077246 Bisection (even part) of Chebyshev sequence with Diophantine property.
 * @author Sean A. Irvine
 */
public class A077246 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077246() {
    super(new long[] {-1, 8}, new long[] {2, 13});
  }
}
