package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097782 Chebyshev polynomials S(n,29) with Diophantine property.
 * @author Sean A. Irvine
 */
public class A097782 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097782() {
    super(new long[] {-1, 29}, new long[] {1, 29});
  }
}
