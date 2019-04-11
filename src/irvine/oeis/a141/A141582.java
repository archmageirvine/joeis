package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141582 <code>a(n) =</code> number of ways to dispose two pawns on a chessboard of size n X n (two dispositions are equivalent if one can be rotated or reflected to give the other one).
 * @author Sean A. Irvine
 */
public class A141582 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141582() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {0, 0, 2, 8, 21, 48, 93});
  }
}
