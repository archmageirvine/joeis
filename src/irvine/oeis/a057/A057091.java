package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057091 Scaled Chebyshev U-polynomials evaluated at <code>i*sqrt(2).</code> Generalized Fibonacci sequence.
 * @author Sean A. Irvine
 */
public class A057091 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057091() {
    super(new long[] {8, 8}, new long[] {1, 8});
  }
}
