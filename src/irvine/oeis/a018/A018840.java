package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018840 Number of steps for {2,3} fairy knight to reach (n,0) on infinite chessboard.
 * @author Sean A. Irvine
 */
public class A018840 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018840() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1},
        new long[] {4, 5, 6, 7, 6, 7, 6},
      0, 5, 4, 5, 2, 5, 2, 5, 4, 5, 4, 7);
  }
}
