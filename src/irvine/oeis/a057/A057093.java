package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057093 Scaled Chebyshev U-polynomials evaluated at <code>i*sqrt(10)/2.</code> Generalized Fibonacci sequence.
 * @author Sean A. Irvine
 */
public class A057093 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057093() {
    super(new long[] {10, 10}, new long[] {1, 10});
  }
}
