package irvine.oeis.a024;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024804 Numbers that are the sum of 3 distinct nonzero squares in 2 or more ways.
 * @author Sean A. Irvine
 */
public class A024804 extends Sequence1 {

  private long mN = 61;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      int c = 0;
      for (long x = 1; 3 * x * x < mN; ++x) {
        final long u = mN - x * x;
        for (long y = x + 1; 2 * y * y < u; ++y) {
          final long v = u - y * y;
          final long s = LongUtils.sqrt(v);
          if (s * s == v && ++c > 1) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
