package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024974 Numbers that are the sum of 3 distinct positive cubes in 2 or more ways.
 * @author Sean A. Irvine
 */
public class A024974 extends Sequence1 {

  private long mN = 1008;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      long c = 0;
      for (long x = 1; 3 * x * x * x < mN; ++x) {
        final long u = mN - x * x * x;
        for (long y = x + 1; 2 * y * y * y < u; ++y) {
          final long v = u - y * y * y;
          final long s = Z.valueOf(v).root(3).longValueExact();
          if (s * s * s == v && ++c > 1) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
