package irvine.oeis.a035;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A035288 Number of ways to place a non-attacking white and black bishop on n X n chessboard.
 * @author Sean A. Irvine
 */
public class A035288 extends LinearRecurrence {

  /** Construct the sequence. */
  public A035288() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {0, 8, 52, 184, 480});
  }
}
