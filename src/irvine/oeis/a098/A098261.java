package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098261 Chebyshev polynomials S(n,627) + S(n-1,627) with Diophantine property.
 * @author Sean A. Irvine
 */
public class A098261 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098261() {
    super(new long[] {-1, 627}, new long[] {1, 628});
  }
}
