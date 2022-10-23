package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A025402 Numbers that are the sum of 3 distinct positive cubes in 3 or more ways.
 * @author Sean A. Irvine
 */
public class A025402 extends Sequence1 {

  private long mN = 1;

  protected int ways() {
    return 3;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      int c = 0;
      for (long x = 1; x * x * x < mN / 3; ++x) {
        final long r = mN - x * x * x;
        for (long y = x + 1; y * y * y < r / 2; ++y) {
          final Z z3 = Z.valueOf(r - y * y * y);
          z3.root(3);
          if (z3.auxiliary() != 0 && ++c >= ways()) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}

