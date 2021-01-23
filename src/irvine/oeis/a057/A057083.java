package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057083 Scaled Chebyshev U-polynomials evaluated at sqrt(3)/2; expansion of 1/(1 - 3*x + 3*x^2).
 * @author Sean A. Irvine
 */
public class A057083 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057083() {
    super(new long[] {-3, 3}, new long[] {1, 3});
  }
}
