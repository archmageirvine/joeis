package irvine.oeis.a025;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A025417 Least sum of 4 distinct nonzero squares in exactly n ways.
 * @author Sean A. Irvine
 */
public class A025417 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long m = 0;
    while (true) {
      ++m;
      int c = 0;
      for (long x = 1; x * x < m / 4; ++x) {
        final long r = m - x * x;
        for (long y = x + 1; y * y < r / 3; ++y) {
          final long s = r - y * y;
          for (long z = y + 1; z * z < s / 2; ++z) {
            final long w2 = s - z * z;
            final long w = LongUtils.sqrt(w2);
            if (w * w == w2 && ++c > mN) {
              break;
            }
          }
        }
      }
      if (c == mN) {
        return Z.valueOf(m);
      }
    }
  }
}

