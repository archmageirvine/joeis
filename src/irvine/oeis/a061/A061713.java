package irvine.oeis.a061;

import irvine.games.RubikCube;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060010 Number of 2n-move sequences on the 3 X 3 X 3 Rubik's Cube (only quarter-twists count as moves) that leave the cube unchanged.
 * @author Sean A. Irvine
 */
public class A061713 extends Sequence0 {

  private int mN = -1;
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
      if ((move.ordinal() & 1) == 0) {
        // half-twist moves are allowed here, but we need to be careful not to double count
        cube.apply(move);
        search(cube, remaining - 1);
        cube.apply(RubikCube.RubikMove.inverse(move));
      }
      cube.apply(RubikCube.RubikMove.inverse(move));
    }
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mCount = 0;
    final RubikCube cube = new RubikCube();
    cube.apply(RubikCube.RubikMove.F); // WLOG assume first move is F
    search(cube, mN - 1);
    mCount *= 2; // clockwise or anticlockwise
    cube.apply(RubikCube.RubikMove.F); // or first move is F^2
    search(cube, mN - 1);
    return Z.valueOf(mCount).multiply(6);
  }
}
