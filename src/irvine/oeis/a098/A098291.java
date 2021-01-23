package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098291 Chebyshev polynomials S(n,731) + S(n-1,731) with Diophantine property.
 * @author Sean A. Irvine
 */
public class A098291 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098291() {
    super(new long[] {-1, 731}, new long[] {1, 732});
  }
}
