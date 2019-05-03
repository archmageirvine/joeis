package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260585 Number of ways to place <code>2n</code> rooks on an <code>n X n</code> board, with 2 rooks in each row and each column, multiple rooks in a cell allowed, and exactly 2 rooks below the main diagonal.
 * @author Sean A. Irvine
 */
public class A260585 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260585() {
    super(new long[] {20, -100, 209, -236, 155, -59, 12}, new long[] {1, 11, 72, 367, 1630, 6680, 26082});
  }
}
