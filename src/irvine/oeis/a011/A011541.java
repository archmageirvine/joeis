package irvine.oeis.a011;

import java.util.ArrayList;
import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011541.
 * @author Sean A. Irvine
 */
public class A011541 implements Sequence {

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
        if (mFirst[c] == null || mFirst[c].compareTo(v) > 0) {
          mFirst[c] = v;
        }
      }
    }
    return mFirst[mN];
  }
}
