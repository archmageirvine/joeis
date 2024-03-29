package irvine.oeis.a006;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A006071 Maximal length of rook tour on an n X n board.
 * @author Sean A. Irvine
 */
public class A006071 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006071() {
    super(1, new long[] {0, -1, 3, -2, -2, 3}, new long[] {1, 4, 14, 38, 76, 136});
  }
}

