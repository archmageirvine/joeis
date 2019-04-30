package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099368 Twice Chebyshev's polynomials of the first kind, <code>T(n,x)</code>, evaluated at <code>x=51/2</code>.
 * @author Sean A. Irvine
 */
public class A099368 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099368() {
    super(new long[] {-1, 51}, new long[] {2, 51});
  }
}
