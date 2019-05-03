package irvine.oeis.a237;

import irvine.oeis.LinearRecurrence;

/**
 * A237530 Number of <code>non-equivalent (mod D_3)</code> ways to choose three points in an <code>n X n X n</code> triangular grid so that they do not form a <code>2 X 2 X 2</code> subtriangle.
 * @author Sean A. Irvine
 */
public class A237530 extends LinearRecurrence {

  /** Construct the sequence. */
  public A237530() {
    super(new long[] {1, -3, 0, 7, -3, -6, 0, 6, 3, -7, 0, 3}, new long[] {0, 4, 22, 82, 231, 566, 1216, 2410, 4428, 7712, 12780, 20392});
  }
}
