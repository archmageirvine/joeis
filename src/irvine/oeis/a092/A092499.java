package irvine.oeis.a092;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A092499 Chebyshev polynomials S(n-1,21) with Diophantine property.
 * @author Sean A. Irvine
 */
public class A092499 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092499() {
    super(new long[] {-1, 21}, new long[] {0, 1});
  }
}
