package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098249 Chebyshev polynomials S(n,291) + S(n-1,291) with Diophantine property.
 * @author Sean A. Irvine
 */
public class A098249 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098249() {
    super(new long[] {-1, 291}, new long[] {1, 292});
  }
}
