package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077240 Bisection <code>(even part)</code> of Chebyshev sequence with Diophantine property.
 * @author Sean A. Irvine
 */
public class A077240 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077240() {
    super(new long[] {-1, 6}, new long[] {5, 23});
  }
}
