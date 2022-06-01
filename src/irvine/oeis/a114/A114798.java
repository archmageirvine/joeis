package irvine.oeis.a114;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A114798 Cubic polynomial coefficients such that an elliptical term is zero.
 * @author Sean A. Irvine
 */
public class A114798 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114798() {
    super(new long[] {-1, 0, 4, 0, -6, 0, 4, 0}, new long[] {3, 2, 12, 16, 27, 54, 48, 128});
  }
}
