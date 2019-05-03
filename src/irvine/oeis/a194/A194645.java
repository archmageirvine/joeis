package irvine.oeis.a194;

import irvine.oeis.LinearRecurrence;

/**
 * A194645 Number of ways to place <code>3n</code> nonattacking kings on a <code>6 X 2n</code> cylindrical chessboard.
 * @author Sean A. Irvine
 */
public class A194645 extends LinearRecurrence {

  /** Construct the sequence. */
  public A194645() {
    super(new long[] {24, -86, 104, -53, 12}, new long[] {32, 100, 344, 1220, 4392});
  }
}
