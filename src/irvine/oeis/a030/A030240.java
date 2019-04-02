package irvine.oeis.a030;

import irvine.oeis.LinearRecurrence;

/**
 * A030240 Scaled Chebyshev U-polynomials evaluated at sqrt(7)/2.
 * @author Sean A. Irvine
 */
public class A030240 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030240() {
    super(new long[] {-7, 7}, new long[] {1, 7});
  }
}
