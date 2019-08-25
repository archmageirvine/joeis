package irvine.oeis.a025;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025331.
 * @author Sean A. Irvine
 */
public class A025331 implements Sequence {

  private long mN = 1;

  protected int ways() {
    return 3;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      int c = 0;
      for (long x = 1; x * x <= mN / 3; ++x) {
        final long r = mN - x * x;
        for (long y = x; y * y <= r / 2; ++y) {
          final long z2 = r - y * y;
          final long z = LongUtils.sqrt(z2);
          if (z * z == z2 && ++c >= ways()) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}

