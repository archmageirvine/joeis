package irvine.oeis.a061;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061341 Numbers not ending in 0 whose cubes are concatenations of other cubes.
 * @author Sean A. Irvine
 */
public class A061341 extends Sequence1 {

  private final ArrayList<String> mCubes = new ArrayList<>();
  private long mN = 0;

  private boolean is(final String c) {
    if (c.isEmpty()) {
      return true;
    }
    for (final String s : mCubes) {
      if (c.startsWith(s) && is(c.substring(s.length()))) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      mCubes.add(Z.valueOf(mN).pow(3).toString());
      final String cube = Z.valueOf(++mN).pow(3).toString();
      final long r = mN % 10;
      if (r != 0 && r != 9 && is(cube)) {
        return Z.valueOf(mN);
      }
    }
  }
}
