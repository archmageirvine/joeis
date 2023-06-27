package irvine.oeis.a035;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A035286 Number of ways to place a non-attacking white and black king on n X n chessboard.
 * @author Sean A. Irvine
 */
public class A035286 extends LinearRecurrence {

  /** Construct the sequence. */
  public A035286() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 32, 156, 456});
  }
}
