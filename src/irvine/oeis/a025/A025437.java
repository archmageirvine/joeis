package irvine.oeis.a025;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A025437 Number of partitions of n into 4 distinct squares.
 * @author Sean A. Irvine
 */
public class A025437 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
      ++mN;
      int c = 0;
      for (long x = 0; x * x < mN / 4; ++x) {
        final long r = mN - x * x;
        for (long y = x + 1; y * y < r / 3; ++y) {
          final long s = r - y * y;
          for (long z = y + 1; z * z < s / 2; ++z) {
            final long w2 = s - z * z;
            final long w = LongUtils.sqrt(w2);
            if (w * w == w2) {
              ++c;
            }
          }
        }
      }
    return Z.valueOf(c);
  }
}

