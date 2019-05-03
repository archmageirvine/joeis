package irvine.oeis.a035;

import irvine.oeis.LinearRecurrence;

/**
 * A035288 Number of ways to place a non-attacking white and black bishop on <code>n X n</code> chessboard.
 * @author Sean A. Irvine
 */
public class A035288 extends LinearRecurrence {

  /** Construct the sequence. */
  public A035288() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 8, 52, 184, 480});
  }
}
