package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a009.A009421;

/**
 * A014157.
 * @author Sean A. Irvine
 */
public class A014157 implements Sequence {

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
          if (A009421.isCube(Z.valueOf(m - s))) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
