package irvine.oeis.a080;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.games.RubikCube;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A080601 Number of positions of the Rubik's cube at a distance of n moves from the solved state, in the half-turn metric.
 * @author Sean A. Irvine
 */
public class A080618 extends Sequence0 {

  private static final RubikCube.RubikMove[] MOVES = {RubikCube.RubikMove.F, RubikCube.RubikMove.U, RubikCube.RubikMove.L, RubikCube.RubikMove.R, RubikCube.RubikMove.D};
  private final Set<RubikCube> mSeen = new HashSet<>();
  private Set<RubikCube> mStates = null;

  @Override
  public Z next() {
    if (mStates == null) {
      mStates = Collections.singleton(new RubikCube());
      mSeen.addAll(mStates);
      return Z.ONE;
    }
    if (mStates.isEmpty()) {
      return null;
    }
    final HashSet<RubikCube> next = new HashSet<>();
    for (final RubikCube cube : mStates) {
      for (final RubikCube.RubikMove move : MOVES) {
        final RubikCube c1 = new RubikCube(cube);
        c1.apply(move);
        if (mSeen.add(c1)) {
          next.add(c1);
        }
        final RubikCube c2 = new RubikCube(cube);
        c2.apply(RubikCube.RubikMove.inverse(move));
        if (mSeen.add(c2)) {
          next.add(c2);
        }
      }
    }
    mStates = next;
    return Z.valueOf(mStates.size());
  }
}
