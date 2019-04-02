package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009421 Cubes formed by concatenating other cubes, not ending in 0.
 * @author Sean A. Irvine
 */
public class A009421 implements Sequence {

  private Z mN = Z.valueOf(21);

  /**
   * Test if a number is a cube.
   * @param v number to test
   * @return true iff the number is a cube
   */
  public static boolean isCube(final Z v) {
    v.root(3);
    return v.auxiliary() == 1;
  }

  private boolean isCubeDecomposable(final String s, final boolean multipart) {
    if (s.isEmpty()) {
      return multipart;
    }
    for (int k = 1; k <= (multipart ? s.length() : s.length() - 1); ++k) {
      final Z v = new Z(s.substring(0, k));
      if (isCube(v) && isCubeDecomposable(s.substring(k), true)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = mN.pow(3);
      if (s.mod(10) != 0 && isCubeDecomposable(s.toString(), false)) {
        return s;
      }
    }
  }
}
