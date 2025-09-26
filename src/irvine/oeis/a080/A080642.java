package irvine.oeis.a080;

import java.util.ArrayList;
import java.util.HashMap;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080642 Cubefree taxicab numbers: the smallest cubefree number that is the sum of 2 positive cubes in n ways.
 * @author Sean A. Irvine
 */
public class A080642 extends Sequence1 {

  private final ArrayList<Z> mCubes = new ArrayList<>();
  private final HashMap<Z, Integer> mCounts = new HashMap<>();
  private final Z[] mFirst = new Z[1000]; // Way more that we can ever expect to achieve
  private int mN = 0;
  private Z mCurrentCube = Z.ZERO;
  private long mC = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirst[mN] == null || mFirst[mN].compareTo(mCurrentCube) < 0) {
      // Process another cube
      mCurrentCube = Z.valueOf(++mC).pow(3);
      mCubes.add(mCurrentCube);
      for (final Z cube : mCubes) {
        final Z v = mCurrentCube.add(cube);
        final int c = mCounts.merge(v, 1, (x, y) -> x + y);
        if ((mFirst[c] == null || mFirst[c].compareTo(v) > 0) && Predicates.CUBE_FREE.is(v)) {
          mFirst[c] = v;
        }
      }
    }
    return mFirst[mN];
  }
}
