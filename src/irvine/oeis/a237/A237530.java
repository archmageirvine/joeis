package irvine.oeis.a237;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A237530 Number of non-equivalent (mod D_3) ways to choose three points in an n X n X n triangular grid so that they do not form a 2 X 2 X 2 subtriangle.
 * @author Sean A. Irvine
 */
public class A237530 extends LinearRecurrence {

  /** Construct the sequence. */
  public A237530() {
    super(new long[] {1, -3, 0, 7, -3, -6, 0, 6, 3, -7, 0, 3}, new long[] {0, 4, 22, 82, 231, 566, 1216, 2410, 4428, 7712, 12780, 20392});
  }
}
