package irvine.oeis.a025;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025439 Number of partitions of n into 6 distinct squares.
 * @author Sean A. Irvine
 */
public class A025439 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
      ++mN;
      int c = 0;
      for (long x = 0; x * x < mN / 6; ++x) {
        final long r = mN - x * x;
        for (long y = x + 1; y * y < r / 5; ++y) {
          final long s = r - y * y;
          for (long z = y + 1; z * z < s / 4; ++z) {
            final long t = s - z * z;
            for (long w = z + 1; w * w < t / 3; ++w) {
              final long q = t - w * w;
              for (long u = w + 1; u * u < q / 2; ++u) {
                final long p2 = q - u * u;
                final long p = LongUtils.sqrt(p2);
                if (p * p == p2) {
                  ++c;
                }
              }
            }
          }
        }
      }
    return Z.valueOf(c);
  }
}

