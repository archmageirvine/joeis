package irvine.oeis.a309;

import java.util.HashSet;
import java.util.Set;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A309279.
 * @author Sean A. Irvine
 */
public class A309279 implements Sequence {

  // Truncated trihexagonal tiling

  // Take y-axis as running vertically, and x-axis running at 60 degrees from the vertical to the right
  // Encode each cell with (x,y,k) where k is a letter in A..M with A being the dodecagon and the others
  // the cells around the dodecagon in a clockwise direction starting with the square immediately above
  // the dodecagon.
  // Further, normalized states are such that x, then y, are as small as possible.  In fact, only
  // letters A..F occur in normalized states.
  // The following is then a state transition function from (x,y,k), theta to (x',y',k') where theta
  // is the angle in degrees (it will always be a multiple of 30 degrees, but in some cells the
  // restrictions are more severe -- e.g. in a square there are only four possible values).
  // Angles measure clockwise.

  static final class State {
    int mX;
    int mY;
    char mK;

    State(final int x, final int y, final char k) {
      mX = x;
      mY = y;
      mK = k;
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof State)) {
        return false;
      }
      final State that = (State) obj;
      return that.mX == mX && that.mY == mY && that.mK == mK;
    }

    @Override
    public int hashCode() {
      return IntegerUtils.hash(mX, mY) * mK;
    }
  }

  private State normal(final int x, final int y, final char k) {
    switch (k) {
      case 'A':
      case 'B':
      case 'C':
      case 'D':
      case 'E':
      case 'F':
        return new State(x, y, k);
      case 'G':
        return new State(x, y - 1, 'C');
      case 'H':
        return new State(x, y - 1, 'B');
      case 'I':
        return new State(x - 1, y, 'E');
      case 'J':
        return new State(x - 1, y, 'D');
      case 'K':
        return new State(x - 1, y, 'C');
      case 'L':
        return new State(x - 1, y + 1, 'F');
      case 'M':
        return new State(x - 1, y + 1, 'E');
      default:
        throw new RuntimeException();
    }
  }

  private State transit(final State state, final int theta) {
    assert theta % 30 == 0;
    assert state != null && state.mK >= 'A' && state.mK <= 'F';
    switch (state.mK) {
      case 'A':
        return normal(state.mX, state.mY, (char) ('B' + theta / 30));
      case 'B':
        switch (theta) {
          case 0:
            return normal(state.mX, state.mY + 1, 'A');
          case 90:
            return normal(state.mX, state.mY, 'C');
          case 180:
            return normal(state.mX, state.mY, 'A');
          case 270:
            return normal(state.mX, state.mY, 'M');
          default:
            throw new RuntimeException();
        }
      case 'C':
        switch (theta) {
          case 30:
            return normal(state.mX, state.mY + 1, 'F');
          case 90:
            return normal(state.mX + 1, state.mY, 'A');
          case 150:
            return normal(state.mX, state.mY, 'D');
          case 210:
            return normal(state.mX, state.mY, 'A');
          case 270:
            return normal(state.mX, state.mY, 'B');
          case 330:
            return normal(state.mX, state.mY + 1, 'A');
          default:
            throw new RuntimeException();
        }
      case 'D':
        switch (theta) {
          case 60:
            return normal(state.mX + 1, state.mY, 'A');
          case 150:
            return normal(state.mX, state.mY, 'E');
          case 240:
            return normal(state.mX, state.mY, 'A');
          case 330:
            return normal(state.mX, state.mY, 'C');
          default:
            throw new RuntimeException();
        }
      case 'E':
        switch (theta) {
          case 30:
            return normal(state.mX + 1, state.mY, 'A');
          case 90:
            return normal(state.mX + 1, state.mY - 1, 'B');
          case 150:
            return normal(state.mX + 1, state.mY - 1, 'A');
          case 210:
            return normal(state.mX, state.mY, 'F');
          case 270:
            return normal(state.mX, state.mY, 'A');
          case 330:
            return normal(state.mX, state.mY, 'D');
          default:
            throw new RuntimeException();
        }
      case 'F':
        switch (theta) {
          case 30:
            return normal(state.mX, state.mY, 'E');
          case 120:
            return normal(state.mX + 1, state.mY - 1, 'A');
          case 210:
            return normal(state.mX, state.mY, 'G');
          case 300:
            return normal(state.mX, state.mY, 'A');
          default:
            throw new RuntimeException();
        }
      default:
        throw new RuntimeException();
    }
  }

  /*
   * On a white dodecagon, turn 30 degrees right, flip the color of the tile, then move forward one unit.
   * On a black dodecagon, turn 30 degrees left, flip the color of the tile, then move forward one unit.
   * On a white hexagon, turn 60 degrees right, flip the color of the tile, then move forward one unit.
   * On a black hexagon, turn 60 degrees left, flip the color of the tile, then move forward one unit.
   * On a white square, turn 90 degrees right, flip the color of the tile, then move forward one unit.
   * On a black square, turn 90 degrees left, flip the color of the tile, then move forward one unit.
   */

  private final Set<State> mBlack = new HashSet<>();
  private State mState;
  private int mAngle = 0;

  @Override
  public Z next() {
    if (mState == null) {
      mState = new State(0, 0, 'A');
    } else {
      if (mBlack.remove(mState)) {
        // was black
        if (mState.mK == 'A') {
          mAngle += 330;
        } else if (mState.mK == 'C' || mState.mK == 'E') {
          mAngle += 300;
        } else {
          mAngle += 270;
        }
      } else {
        // was white
        mBlack.add(mState);
        if (mState.mK == 'A') {
          mAngle += 30;
        } else if (mState.mK == 'C' || mState.mK == 'E') {
          mAngle += 60;
        } else {
          mAngle += 90;
        }
      }
      mAngle %= 360;
      mState = transit(mState, mAngle);
    }
    //System.out.println("(" + mState.mX + "," + mState.mY + "," + mState.mK + ") " + mAngle + " " + mBlack.contains(mState));
    return Z.valueOf(mBlack.size());
  }
}
