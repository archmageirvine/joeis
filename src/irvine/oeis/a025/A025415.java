package irvine.oeis.a025;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025415 Least sum of 3 distinct nonzero squares in exactly n ways.
 * @author Sean A. Irvine
 */
public class A025415 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long m = 0;
    while (true) {
      ++m;
      int c = 0;
      for (long x = 1; x * x < m / 3; ++x) {
        final long r = m - x * x;
        for (long y = x + 1; y * y < r / 2; ++y) {
          final long z2 = r - y * y;
          final long z = LongUtils.sqrt(z2);
          if (z * z == z2 && ++c > mN) {
            break;
          }
        }
      }
      if (c == mN) {
        return Z.valueOf(m);
      }
    }
  }
}

