package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152135 Maximal length of rook tour on an n X n+4 board.
 * @author Sean A. Irvine
 */
public class A152135 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152135() {
    super(1, new long[] {-1, 3, -2, -2, 3}, new long[] {12, 36, 74, 134, 216});
  }
}
