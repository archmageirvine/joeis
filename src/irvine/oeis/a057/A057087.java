package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057087 Scaled Chebyshev U-polynomials evaluated at i. Generalized Fibonacci sequence.
 * @author Sean A. Irvine
 */
public class A057087 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057087() {
    super(new long[] {4, 4}, new long[] {1, 4});
  }
}
