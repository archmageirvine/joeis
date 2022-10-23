package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A025465 Number of partitions of n into 3 distinct nonnegative cubes.
 * @author Sean A. Irvine
 */
public class A025465 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
      ++mN;
      int c = 0;
      for (long x = 0; x * x * x < mN / 3; ++x) {
        final long r = mN - x * x * x;
        for (long y = x + 1; y * y * y < r / 2; ++y) {
          final Z z3 = Z.valueOf(r - y * y * y);
          z3.root(3);
          if (z3.auxiliary() != 0) {
            ++c;
          }
        }
      }
    return Z.valueOf(c);
  }
}

