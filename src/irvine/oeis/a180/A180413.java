package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180413 Total number of possible knight moves on <code>an n</code> X n X n chessboard, if the knight is placed anywhere.
 * @author Sean A. Irvine
 */
public class A180413 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180413() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 144, 576, 1440});
  }
}
