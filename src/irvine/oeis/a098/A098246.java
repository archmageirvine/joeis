package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098246 Chebyshev polynomials S(n,227) + S(n-1,227) with Diophantine property.
 * @author Sean A. Irvine
 */
public class A098246 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098246() {
    super(new long[] {-1, 227}, new long[] {1, 228});
  }
}
