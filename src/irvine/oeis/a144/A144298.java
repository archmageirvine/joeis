package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144298 Number of cycles of length 3 in the queen's graph associated with <code>an n</code> X n chessboard.
 * @author Sean A. Irvine
 */
public class A144298 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144298() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {0, 0, 4, 36, 124, 320, 672});
  }
}
