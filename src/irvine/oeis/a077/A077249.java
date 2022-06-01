package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077249 Bisection (odd part) of Chebyshev sequence with Diophantine property.
 * @author Sean A. Irvine
 */
public class A077249 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077249() {
    super(new long[] {-1, 10}, new long[] {2, 21});
  }
}
