package irvine.oeis.a114;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A114050 x-values in the solution to x^2 - 22*y^2 = 1.
 * @author Sean A. Irvine
 */
public class A114050 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114050() {
    super(1, new long[] {-1, 394}, new long[] {1, 197});
  }
}
