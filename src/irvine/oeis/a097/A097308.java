package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097308 Chebyshev T-polynomials <code>T(n,13)</code> with Diophantine property.
 * @author Sean A. Irvine
 */
public class A097308 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097308() {
    super(new long[] {-1, 26}, new long[] {1, 13});
  }
}
