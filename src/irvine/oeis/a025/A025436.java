package irvine.oeis.a025;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A025436 Number of partitions of n into 3 distinct squares.
 * @author Sean A. Irvine
 */
public class A025436 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
      ++mN;
      int c = 0;
      for (long x = 0; x * x < mN / 3; ++x) {
        final long r = mN - x * x;
        for (long y = x + 1; y * y < r / 2; ++y) {
          final long z2 = r - y * y;
          final long z = LongUtils.sqrt(z2);
          if (z * z == z2) {
            ++c;
          }
        }
      }
    return Z.valueOf(c);
  }
}

