package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A025408 Numbers that are the sum of 4 distinct positive cubes in exactly 1 way.
 * @author Sean A. Irvine
 */
public class A025408 extends Sequence1 {

  private long mN = 1;

  protected int ways() {
    return 1;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      int c = 0;
      for (long x = 1; x * x * x < mN / 4; ++x) {
        final long r = mN - x * x * x;
        for (long y = x + 1; y * y * y < r / 3; ++y) {
          final long s = r - y * y * y;
          for (long z = y + 1; z * z * z < s / 2; ++z) {
            final Z w3 = Z.valueOf(s - z * z * z);
            w3.root(3);
            if (w3.auxiliary() != 0 && ++c > ways()) {
              break;
            }
          }
        }
      }
      if (c == ways()) {
        return Z.valueOf(mN);
      }
    }
  }
}

