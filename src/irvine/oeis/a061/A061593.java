package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061593 Number of ways to place 2n nonattacking kings on a 4 X 2n chessboard.
 * @author Sean A. Irvine
 */
public class A061593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061593() {
    super(new long[] {-9, 33, -28, 9}, new long[] {12, 79, 408, 1847});
  }
}
