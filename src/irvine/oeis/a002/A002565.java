package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002565 Number of non-isomorphic ways to attack all squares on an <code>n X n</code> chessboard using the smallest possible number of queens with each queen attacking at least one other.
 * @author Sean A. Irvine
 */
public class A002565 extends A002566 {

  @Override
  protected boolean isCounted(final Z q) {
    return A002563.isCounted(q, mBoardSize);
  }
 
}
