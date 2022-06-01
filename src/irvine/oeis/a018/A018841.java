package irvine.oeis.a018;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A018841 Number of steps for {2,3} fairy knight to reach (n,n) on infinite chessboard.
 * @author Sean A. Irvine
 */
public class A018841 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018841() {
    super(new long[] {-1, 1, 0, 0, 0, 1},
        new long[] {6, 6, 6, 8, 6, 8},
      0, 2, 4, 6, 4, 2, 4, 6, 6, 6, 4);
  }
}
