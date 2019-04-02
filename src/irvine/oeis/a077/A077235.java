package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077235 Bisection (odd part) of Chebyshev sequence with Diophantine property.
 * @author Sean A. Irvine
 */
public class A077235 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077235() {
    super(new long[] {-1, 4}, new long[] {5, 16});
  }
}
