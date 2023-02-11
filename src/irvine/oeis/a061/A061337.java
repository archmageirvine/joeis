package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A061337 Smallest number of distinct triangular numbers which sum to n (or -1 if not possible).
 * @author Sean A. Irvine
 */
public class A061337 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    if (mN == 20) {
      return Z.FOUR;
    }
    if (ZUtils.isTriangular(Z.valueOf(mN))) {
      return Z.ONE;
    }
    for (long j, k = 1; 2 * (j = k * (k + 1) / 2) < mN; ++k) {
      if (ZUtils.isTriangular(Z.valueOf(mN - j))) {
        return Z.TWO;
      }
    }
    for (long a, k = 1; (a = k * (k + 1) / 2) < mN; ++k) {
      final long t = mN - a;
      for (long b, j = k + 1; (b = j * (j + 1) / 2) < t; ++j) {
        final long s = t - b;
        if (s > b && ZUtils.isTriangular(Z.valueOf(s))) {
          return Z.THREE;
        }
      }
    }
    return Z.NEG_ONE;
  }
}
