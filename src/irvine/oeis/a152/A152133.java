package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152133 Maximal length of rook tour on an <code>n X n+2</code> board.
 * @author Sean A. Irvine
 */
public class A152133 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152133() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {4, 16, 38, 78, 136});
  }
}
