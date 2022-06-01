package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156001 Number of cycles of length 4 in the queen's graph associated with an n X n chessboard.
 * @author Sean A. Irvine
 */
public class A156001 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156001() {
    super(new long[] {-1, 3, 0, -8, 6, 6, -8, 0, 3}, new long[] {0, 0, 3, 122, 776, 2704, 6987, 15206, 29224});
  }
}
