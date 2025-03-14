package irvine.oeis.a228;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A228207 x-values in the solution to x^2 - 20*y^2 = 176.
 * @author Sean A. Irvine
 */
public class A228207 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228207() {
    super(1, new long[] {-1, 0, 3, 0}, new long[] {14, 16, 26, 34});
  }
}
