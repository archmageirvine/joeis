package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077250 Bisection (odd part) of Chebyshev sequence with Diophantine property.
 * @author Sean A. Irvine
 */
public class A077250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077250() {
    super(new long[] {-1, 10}, new long[] {11, 103});
  }
}
