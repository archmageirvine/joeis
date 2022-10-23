package irvine.oeis.a019;

import java.util.HashSet;

import chesspresso.move.IllegalMoveException;
import chesspresso.position.Position;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A019319 Number of possible chess diagrams after n plies.
 * @author Sean A. Irvine
 */
public class A019319 extends Sequence0 {

  // Cf. A048987

  private int mN = -1;
  private final HashSet<String> mDiagrams = new HashSet<>();
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
        final String fen = mPosition.getFEN();
        mDiagrams.add(fen.substring(0, fen.indexOf(' ')));
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
    mDiagrams.clear();
    mPosition = start();
    try {
      recurse();
    } catch (final IllegalMoveException e) {
      throw new RuntimeException(e);
    }
    return Z.valueOf(mDiagrams.size());
  }
}

