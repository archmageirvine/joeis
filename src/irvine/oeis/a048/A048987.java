package irvine.oeis.a048;

import chesspresso.move.IllegalMoveException;
import chesspresso.position.Position;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048987 Number of possible chess games at the end of the n-th ply.
 * @author Sean A. Irvine
 */
public class A048987 extends Sequence0 {

  // Starting point was example code at https://luckytoilet.wordpress.com/tag/chesspresso/

  private int mN = -1;
  private long mCount = 0;
  private Position mPosition = null;

  protected boolean accept(final Position position) {
    return true;
  }

  // All the data is mutable and therefore is stored globally.
  // Calling this method should not change the state of the mPosition
  // since any changes are eventually undone.
  private void recurse() throws IllegalMoveException {
    if (mPosition.getPlyNumber() >= mN) {
      if (accept(mPosition)) {
        ++mCount;
      }
      return;
    }

    // Recurse all the possible next positions.
    for (final short thisMove : mPosition.getAllMoves()) {
      // Make the move, recurse, and undo the move.
      mPosition.doMove(thisMove);
      recurse();
      mPosition.undoMove();
    }
  }

  protected Position start() {
    return Position.createInitialPosition();
  }


  @Override
  public Z next() {
    ++mN;
    mCount = 0;
    mPosition = start();
    try {
      recurse();
    } catch (final IllegalMoveException e) {
      throw new RuntimeException(e);
    }
    return Z.valueOf(mCount);
  }
}

