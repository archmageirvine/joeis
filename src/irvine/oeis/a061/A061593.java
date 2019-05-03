package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061593 Number of ways to place <code>2n</code> nonattacking kings on a <code>4 X 2n</code> chessboard.
 * @author Sean A. Irvine
 */
public class A061593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061593() {
    super(new long[] {-9, 33, -28, 9}, new long[] {12, 79, 408, 1847});
  }
}
