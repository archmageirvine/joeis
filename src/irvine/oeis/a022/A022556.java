package irvine.oeis.a022;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A022556 Numbers that are a sum of a square and 2 nonnegative cubes.
 * @author Sean A. Irvine
 */
public class A022556 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      long x2y3;
      for (long x = 0; (x2y3 = mN - x * x * x) >= 0; ++x) {
        long z2;
        for (long y = 0; (z2 = x2y3 - y * y * y) >= 0; ++y) {
          final long z = Functions.SQRT.l(z2);
          if (z * z == z2) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}

