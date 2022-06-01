package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099368 Twice Chebyshev polynomials of the first kind, T(n,x), evaluated at x=51/2.
 * @author Sean A. Irvine
 */
public class A099368 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099368() {
    super(new long[] {-1, 51}, new long[] {2, 51});
  }
}
