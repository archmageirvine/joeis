package irvine.oeis.a098;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A098260 Chebyshev polynomials S(n,627).
 * @author Sean A. Irvine
 */
public class A098260 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098260() {
    super(new long[] {-1, 627}, new long[] {1, 627});
  }
}
