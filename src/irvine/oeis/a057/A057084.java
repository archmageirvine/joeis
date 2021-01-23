package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057084 Scaled Chebyshev U-polynomials evaluated at sqrt(2).
 * @author Sean A. Irvine
 */
public class A057084 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057084() {
    super(new long[] {-8, 8}, new long[] {1, 8});
  }
}
