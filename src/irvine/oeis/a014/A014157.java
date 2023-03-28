package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A014157 Numbers that are the sum of 2 cubes and a triangular number.
 * @author Sean A. Irvine
 */
public class A014157 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      long t;
      for (long k = 0; (t = k * (k + 1) / 2) <= mN; ++k) {
        final long m = mN - t;
        long s;
        for (long c = 0; (s = c * c * c) <= m; ++c) {
          if (ZUtils.isCube(Z.valueOf(m - s))) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
