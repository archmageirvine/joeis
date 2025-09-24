package irvine.oeis.a080;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.games.RubikCube;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060010.
 * @author Sean A. Irvine
 */
public class A080601 extends Sequence0 {

  private static final RubikCube.RubikMove[] SQUAREABLE = {RubikCube.RubikMove.F, RubikCube.RubikMove.U, RubikCube.RubikMove.D, RubikCube.RubikMove.L, RubikCube.RubikMove.R, RubikCube.RubikMove.B};
  private int mN = -1;
  private final Set<RubikCube> mSeen = new HashSet<>();
  private Set<RubikCube> mStates = null;

  @Override
  public Z next() {
    if (++mN == 0) {
      mStates = Collections.singleton(new RubikCube());
      mSeen.addAll(mStates);
      return Z.ONE;
    }
    final HashSet<RubikCube> next = new HashSet<>();
    for (final RubikCube cube : mStates) {
      for (final RubikCube.RubikMove move : RubikCube.RubikMove.values()) {
        final RubikCube copy = new RubikCube(cube);
        copy.apply(move);
        if (mSeen.add(copy)) {
          next.add(copy);
        }
      }
      for (final RubikCube.RubikMove move : SQUAREABLE) {
        final RubikCube copy = new RubikCube(cube);
        copy.apply(move);
        copy.apply(move); // i.e., move^2
        if (mSeen.add(copy)) {
          next.add(copy);
        }
      }
    }
    mStates = next;
    return Z.valueOf(mStates.size());
  }
}
