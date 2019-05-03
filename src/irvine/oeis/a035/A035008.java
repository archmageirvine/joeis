package irvine.oeis.a035;

import irvine.oeis.LinearRecurrence;

/**
 * A035008 Total number of possible knight moves on an <code>(n+2) X (n+2)</code> chessboard, if the knight is placed anywhere.
 * @author Sean A. Irvine
 */
public class A035008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A035008() {
    super(new long[] {1, -3, 3}, new long[] {0, 16, 48});
  }
}
