package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077240 Bisection (even part) of Chebyshev sequence with Diophantine property.
 * @author Sean A. Irvine
 */
public class A077240 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077240() {
    super(new long[] {-1, 6}, new long[] {5, 23});
  }
}
