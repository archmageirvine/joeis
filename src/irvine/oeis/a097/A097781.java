package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097781 Chebyshev polynomials S(n,27) with Diophantine property.
 * @author Sean A. Irvine
 */
public class A097781 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097781() {
    super(new long[] {-1, 27}, new long[] {1, 27});
  }
}
