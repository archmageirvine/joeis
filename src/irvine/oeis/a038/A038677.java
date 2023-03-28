package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A038677 Cubes ending in a (different) positive cube.
 * @author Sean A. Irvine
 */
public class A038677 extends Sequence1 {

  private long mN = 10;

  @Override
  public Z next() {
    while (true) {
      final Z n3 = Z.valueOf(++mN).pow(3);
      // Efficiency, any cube ending with 1 or 8=2^3 is in
      final long r = n3.mod(10);
      if (r == 1 || r == 8) {
        return n3;
      }
      final String s = n3.toString();
      for (int k = s.length() - 2; k > 0; --k) {
        final Z t = new Z(s.substring(k));
        if (!t.isZero() && ZUtils.isCube(t)) {
          return n3;
        }
      }
    }
  }
}
