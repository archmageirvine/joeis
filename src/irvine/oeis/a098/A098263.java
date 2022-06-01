package irvine.oeis.a098;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A098263 Chebyshev polynomials S(n,731).
 * @author Sean A. Irvine
 */
public class A098263 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098263() {
    super(new long[] {-1, 731}, new long[] {1, 731});
  }
}
