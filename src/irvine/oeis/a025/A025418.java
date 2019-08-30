package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025418 Least sum of 3 positive cubes in exactly n ways.
 * @author Sean A. Irvine
 */
public class A025418 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long m = 0;
    while (true) {
      ++m;
      int c = 0;
      for (long x = 1; x * x * x <= m / 3; ++x) {
        final long r = m - x * x * x;
        for (long y = x; y * y * y <= r / 2; ++y) {
          final Z z3 = Z.valueOf(r - y * y * y);
          z3.root(3);
          if (z3.auxiliary() != 0 && ++c > mN) {
            break;
          }
        }
      }
      if (c == mN) {
        return Z.valueOf(m);
      }
    }
  }
}

