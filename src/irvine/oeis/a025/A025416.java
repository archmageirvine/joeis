package irvine.oeis.a025;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A025416 Least sum of 4 nonzero squares in exactly n ways.
 * @author Sean A. Irvine
 */
public class A025416 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long m = -1;
    while (true) {
      ++m;
      int c = 0;
      for (long x = 1; x * x <= m / 4; ++x) {
        final long r = m - x * x;
        for (long y = x; y * y <= r / 3; ++y) {
          final long s = r - y * y;
          for (long z = y; z * z <= s / 2; ++z) {
            final long w2 = s - z * z;
            final long w = Functions.SQRT.l(w2);
            if (w * w == w2 && ++c > mN) {
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

