package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152134 Maximal length of rook tour on an n X n+3 board.
 * @author Sean A. Irvine
 */
public class A152134 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152134() {
    super(1, new long[] {-1, 3, -3, 1, 1, -3, 3}, new long[] {8, 24, 54, 102, 174, 270, 396});
  }
}
