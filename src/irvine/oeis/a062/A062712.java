package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A062712 Numbers that are n-gons for three or more n's, where n=3,4,5,...,16.
 * @author Sean A. Irvine
 */
public class A062712 extends Sequence1 {

  private long mN = 0;

  private static boolean isPolygonal(final long n, final long k) {
    return ZUtils.isPolygonal(Z.valueOf(n), k);
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      int cnt = 0;
      for (int k = 3; k <= 16; ++k) {
        if (isPolygonal(mN, k) && ++cnt >= 3) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
