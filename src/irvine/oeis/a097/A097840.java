package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097840 Chebyshev polynomials S(n,83) + S(n-1,83) with Diophantine property.
 * @author Sean A. Irvine
 */
public class A097840 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097840() {
    super(new long[] {-1, 83}, new long[] {1, 84});
  }
}
