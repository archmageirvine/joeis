package irvine.oeis.a098;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A098254 Chebyshev polynomials S(n,443).
 * @author Sean A. Irvine
 */
public class A098254 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098254() {
    super(new long[] {-1, 443}, new long[] {1, 443});
  }
}
