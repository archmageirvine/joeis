package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077234 Bisection (odd part) of Chebyshev sequence with Diophantine property.
 * @author Sean A. Irvine
 */
public class A077234 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077234() {
    super(new long[] {-1, 4}, new long[] {2, 9});
  }
}
