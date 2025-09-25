package irvine.oeis.a080;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.games.RubikCube;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A080583 Number of positions that the 3 X 3 X 3 Rubik cube puzzle can be in after exactly n moves.
 * @author Sean A. Irvine
 */
public class A080583 extends Sequence0 {

  private static final RubikCube.RubikMove[] SQUAREABLE = {RubikCube.RubikMove.F, RubikCube.RubikMove.U, RubikCube.RubikMove.D, RubikCube.RubikMove.L, RubikCube.RubikMove.R, RubikCube.RubikMove.B};
  private int mN = -1;
  private Set<RubikCube> mStates = null;

  @Override
  public Z next() {
    if (++mN == 0) {
      mStates = Collections.singleton(new RubikCube());
      return Z.ONE;
    }
    final HashSet<RubikCube> next = new HashSet<>();
    for (final RubikCube cube : mStates) {
      for (final RubikCube.RubikMove move : RubikCube.RubikMove.values()) {
        final RubikCube copy = new RubikCube(cube);
        copy.apply(move);
        next.add(copy);
      }
      for (final RubikCube.RubikMove move : SQUAREABLE) {
        final RubikCube copy = new RubikCube(cube);
        copy.apply(move);
        copy.apply(move); // i.e., move^2
        next.add(copy);
      }
    }
    mStates = next;
    return Z.valueOf(mStates.size());
  }
}
