package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077420 Bisection of Chebyshev sequence T(n,3) (odd part) with Diophantine property.
 * @author Sean A. Irvine
 */
public class A077420 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077420() {
    super(new long[] {-1, 34}, new long[] {1, 33});
  }
}
