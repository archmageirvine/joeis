package irvine.oeis.a057;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A057092 Scaled Chebyshev U-polynomials evaluated at i*3/2. Generalized Fibonacci sequence.
 * @author Sean A. Irvine
 */
public class A057092 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057092() {
    super(new long[] {9, 9}, new long[] {1, 9});
  }
}
