package irvine.oeis.a060;

import irvine.games.RubikCube;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A060010 Number of 2n-move sequences on the 3 X 3 X 3 Rubik's Cube (only quarter-twists count as moves) that leave the cube unchanged.
 * @author Sean A. Irvine
 */
public class A060010 implements Sequence {

  private int mN = -2;
  private long mCount = 0;

  private void search(final RubikCube cube, final int remaining) {
    if (remaining == 0) {
      if (cube.isIdentity()) {
        ++mCount;
      }
      return;
    }
    for (final RubikCube.RubikMove move : RubikCube.RubikMove.values()) {
      cube.apply(move);
      search(cube, remaining - 1);
      cube.apply(RubikCube.RubikMove.inverse(move));
    }
  }

  @Override
  public Z next() {
    mN += 2;
    if (mN == 0) {
      return Z.ONE;
    }
    mCount = 0;
    // WLOG assume first move is F
    final RubikCube cube = new RubikCube();
    cube.apply(RubikCube.RubikMove.F);
    search(cube, mN - 1);
    return Z.valueOf(mCount).multiply(12);
  }
}
