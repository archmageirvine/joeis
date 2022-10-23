package irvine.oeis.a051;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051302 Numbers whose square can be expressed as the sum of two positive cubes in more than one way.
 * @author Sean A. Irvine
 */
public class A051302 extends Sequence1 {

  private long mN = 77975;
  private final HashSet<Z> mCubes = new HashSet<>();
  private long mM = 1;
  private Z mC = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final Z n2 = Z.valueOf(++mN).square();
      Z cube;
      boolean seen = false;
      final Z lim = n2.divide2();
      for (long k = 1; (cube = Z.valueOf(k).pow(3)).compareTo(lim) <= 0; ++k) {
        final Z t = n2.subtract(cube);
        while (t.compareTo(mC) >= 0) {
          mCubes.add(mC);
          mC = Z.valueOf(++mM).pow(3);
        }
        if (mCubes.contains(t)) {
          if (seen) {
            return Z.valueOf(mN);
          }
          seen = true;
        }
      }
    }
  }
}
