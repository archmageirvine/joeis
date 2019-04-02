package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098244 First differences of Chebyshev polynomials S(n,171)=A097844(n) with Diophantine property.
 * @author Sean A. Irvine
 */
public class A098244 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098244() {
    super(new long[] {-1, 171}, new long[] {1, 170});
  }
}
