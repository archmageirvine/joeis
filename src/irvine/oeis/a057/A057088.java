package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057088 Scaled Chebyshev U-polynomials evaluated at i*sqrt(5)/2. Generalized Fibonacci sequence.
 * @author Sean A. Irvine
 */
public class A057088 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057088() {
    super(new long[] {5, 5}, new long[] {1, 5});
  }
}
