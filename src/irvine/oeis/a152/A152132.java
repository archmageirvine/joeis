package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152132 Maximal length of rook tour on an n X n+1 board.
 * @author Sean A. Irvine
 */
public class A152132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152132() {
    super(new long[] {-1, 3, -3, 1, 1, -3, 3}, new long[] {2, 8, 24, 54, 104, 174, 270});
  }
}
