package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057090 Scaled Chebyshev U-polynomials evaluated at i*sqrt(7)/2. Generalized Fibonacci sequence.
 * @author Sean A. Irvine
 */
public class A057090 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057090() {
    super(new long[] {7, 7}, new long[] {1, 7});
  }
}
