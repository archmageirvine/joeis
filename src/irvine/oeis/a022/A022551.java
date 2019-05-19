package irvine.oeis.a022;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022551 Numbers that are the sum of 2 squares and a nonnegative cube.
 * @author Sean A. Irvine
 */
public class A022551 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      long x2y2;
      for (long x = 0; (x2y2 = mN - x * x * x) >= 0; ++x) {
        long z2;
        for (long y = 0; (z2 = x2y2 - y * y) >= 0; ++y) {
          final long z = LongUtils.sqrt(z2);
          if (z * z == z2) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}

