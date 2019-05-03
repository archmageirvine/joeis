package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077244 Bisection <code>(odd part)</code> of Chebyshev sequence with Diophantine property.
 * @author Sean A. Irvine
 */
public class A077244 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077244() {
    super(new long[] {-1, 8}, new long[] {3, 22});
  }
}
