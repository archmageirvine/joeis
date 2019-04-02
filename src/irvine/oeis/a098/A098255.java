package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098255 Chebyshev polynomials S(n,443) + S(n-1,443) with Diophantine property.
 * @author Sean A. Irvine
 */
public class A098255 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098255() {
    super(new long[] {-1, 443}, new long[] {1, 444});
  }
}
