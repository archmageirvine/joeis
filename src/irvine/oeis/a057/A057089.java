package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057089 Scaled Chebyshev U-polynomials evaluated at i*sqrt(6)/2. Generalized Fibonacci sequence.
 * @author Sean A. Irvine
 */
public class A057089 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057089() {
    super(new long[] {6, 6}, new long[] {1, 6});
  }
}
