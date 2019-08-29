package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025406 Numbers that are the sum of 4 positive cubes in 2 or more ways.
 * @author Sean A. Irvine
 */
public class A025406 implements Sequence {

  private long mN = 1;

  protected int ways() {
    return 2;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      int c = 0;
      for (long x = 1; x * x * x <= mN / 4; ++x) {
        final long r = mN - x * x * x;
        for (long y = x; y * y * y <= r / 3; ++y) {
          final long s = r - y * y * y;
          for (long z = y; z * z * z <= s / 2; ++z) {
            final Z w3 = Z.valueOf(s - z * z * z);
            w3.root(3);
            if (w3.auxiliary() != 0 && ++c >= ways()) {
              return Z.valueOf(mN);
            }
          }
        }
      }
    }
  }
}

