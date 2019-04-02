package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114048 x-values in the solution to x^2 - 19*y^2 = 1.
 * @author Sean A. Irvine
 */
public class A114048 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114048() {
    super(new long[] {-1, 340}, new long[] {1, 170});
  }
}
