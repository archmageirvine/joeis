package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099373 Twice Chebyshev's polynomials of the first kind, T(n,x), evaluated at <code>83/2</code>.
 * @author Sean A. Irvine
 */
public class A099373 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099373() {
    super(new long[] {-1, 83}, new long[] {2, 83});
  }
}
