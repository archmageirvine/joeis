package irvine.oeis.a022;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022556.
 * @author Sean A. Irvine
 */
public class A022556 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      long x2y3;
      for (long x = 0; (x2y3 = mN - x * x * x) >= 0; ++x) {
        long z2;
        for (long y = 0; (z2 = x2y3 - y * y * y) >= 0; ++y) {
          final long z = LongUtils.sqrt(z2);
          if (z * z == z2) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}

