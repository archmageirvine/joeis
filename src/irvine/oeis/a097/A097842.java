package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097842 Chebyshev polynomials S(n,123) + S(n-1,123) with Diophantine property.
 * @author Sean A. Irvine
 */
public class A097842 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097842() {
    super(new long[] {-1, 123}, new long[] {1, 124});
  }
}
