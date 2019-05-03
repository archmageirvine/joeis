package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227959 Number of tilings using monominoes and L-triominoes in <code>2 X n</code> chessboard, such that three monominoes cannot occur together in shape of <code>L-triomino</code>.
 * @author Sean A. Irvine
 */
public class A227959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227959() {
    super(new long[] {4, 2, 2, 4, 0}, new long[] {1, 1, 4, 6, 20});
  }
}
