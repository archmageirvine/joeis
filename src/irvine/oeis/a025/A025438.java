package irvine.oeis.a025;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A025438 Number of partitions of n into 5 distinct squares.
 * @author Sean A. Irvine
 */
public class A025438 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
      ++mN;
      int c = 0;
      for (long x = 0; x * x < mN / 5; ++x) {
        final long r = mN - x * x;
        for (long y = x + 1; y * y < r / 4; ++y) {
          final long s = r - y * y;
          for (long z = y + 1; z * z < s / 3; ++z) {
            final long t = s - z * z;
            for (long w = z + 1; w * w < t / 2; ++w) {
              final long u2 = t - w * w;
              final long u = Functions.SQRT.l(u2);
              if (u * u == u2) {
                ++c;
              }
            }
          }
        }
      }
    return Z.valueOf(c);
  }
}

