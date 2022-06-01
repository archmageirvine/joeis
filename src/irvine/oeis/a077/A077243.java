package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077243 Bisection (odd part) of Chebyshev sequence with Diophantine property.
 * @author Sean A. Irvine
 */
public class A077243 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077243() {
    super(new long[] {-1, 8}, new long[] {2, 17});
  }
}
