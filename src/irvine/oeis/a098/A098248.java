package irvine.oeis.a098;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A098248 Chebyshev polynomials S(n,291).
 * @author Sean A. Irvine
 */
public class A098248 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098248() {
    super(new long[] {-1, 291}, new long[] {1, 291});
  }
}
