package irvine.oeis.a051;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051386 Numbers whose 4th power is the sum of two positive cubes.
 * @author Sean A. Irvine
 */
public class A051386 extends Sequence1 {

  private long mN = 1;
  private final HashSet<Z> mCubes = new HashSet<>();
  private long mM = 1;
  private Z mC = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final Z n4 = Z.valueOf(++mN).pow(4);
      Z cube;
      final Z lim = n4.divide2();
      for (long k = 1; (cube = Z.valueOf(k).pow(3)).compareTo(lim) <= 0; ++k) {
        final Z t = n4.subtract(cube);
        while (t.compareTo(mC) >= 0) {
          mCubes.add(mC);
          mC = Z.valueOf(++mM).pow(3);
        }
        if (mCubes.contains(t)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
