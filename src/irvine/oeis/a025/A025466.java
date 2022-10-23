package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A025466 Number of partitions of n into 4 distinct nonnegative cubes.
 * @author Sean A. Irvine
 */
public class A025466 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
      ++mN;
      int c = 0;
      for (long x = 0; x * x * x < mN / 4; ++x) {
        final long r = mN - x * x * x;
        for (long y = x + 1; y * y * y < r / 3; ++y) {
          final long s = r - y * y * y;
          for (long z = y + 1; z * z * z < s / 2; ++z) {
            final Z w3 = Z.valueOf(s - z * z * z);
            w3.root(3);
            if (w3.auxiliary() != 0) {
              ++c;
            }
          }
        }
      }
    return Z.valueOf(c);
  }
}

