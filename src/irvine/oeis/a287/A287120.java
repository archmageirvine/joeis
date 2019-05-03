package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287120 Number of non-attacking bishop positions on a <code>3 X n</code> chessboard.
 * @author Sean A. Irvine
 */
public class A287120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287120() {
    super(new long[] {1, -1, 0, -2, -10, 4, 2, 0, 3}, new long[] {1, 8, 25, 70, 225, 748, 2401, 7668, 24649});
  }
}
