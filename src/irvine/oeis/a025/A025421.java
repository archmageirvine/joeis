package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A025421 Least sum of 4 distinct positive cubes in exactly n ways.
 * @author Sean A. Irvine
 */
public class A025421 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long m = 0;
    while (true) {
      ++m;
      int c = 0;
      for (long x = 1; x * x * x < m / 4; ++x) {
        final long r = m - x * x * x;
        for (long y = x + 1; y * y * y < r / 3; ++y) {
          final long s = r - y * y * y;
          for (long z = y + 1; z * z * z < s / 2; ++z) {
            final Z w3 = Z.valueOf(s - z * z * z);
            w3.root(3);
            if (w3.auxiliary() != 0 && ++c > mN) {
              break;
            }
          }
        }
      }
      if (c == mN) {
        return Z.valueOf(m);
      }
    }
  }
}

