package irvine.oeis.a025;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025386 Numbers that are the sum of 4 distinct nonzero squares in 2 or more ways.
 * @author Sean A. Irvine
 */
public class A025386 implements Sequence {

  private long mN = 1;

  protected int ways() {
    return 2;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      int c = 0;
      for (long x = 1; x * x < mN / 4; ++x) {
        final long r = mN - x * x;
        for (long y = x + 1; y * y < r / 3; ++y) {
          final long s = r - y * y;
          for (long z = y + 1; z * z < s / 2; ++z) {
            final long w2 = s - z * z;
            final long w = LongUtils.sqrt(w2);
            if (w * w == w2 && ++c >= ways()) {
              return Z.valueOf(mN);
            }
          }
        }
      }
    }
  }
}

