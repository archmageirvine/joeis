package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A009421 Cubes, not ending in 0, formed by concatenating other cubes.
 * @author Sean A. Irvine
 */
public class A009421 extends Sequence1 {

  private Z mN = Z.valueOf(21);

  private boolean isCubeDecomposable(final String s, final boolean multipart) {
    if (s.isEmpty()) {
      return multipart;
    }
    for (int k = 1; k <= (multipart ? s.length() : s.length() - 1); ++k) {
      final Z v = new Z(s.substring(0, k));
      if (ZUtils.isCube(v) && isCubeDecomposable(s.substring(k), true)) {
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
