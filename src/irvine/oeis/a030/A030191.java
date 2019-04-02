package irvine.oeis.a030;

import irvine.oeis.LinearRecurrence;

/**
 * A030191 Scaled Chebyshev U-polynomial evaluated at sqrt(5)/2.
 * @author Sean A. Irvine
 */
public class A030191 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030191() {
    super(new long[] {-5, 5}, new long[] {1, 5});
  }
}
