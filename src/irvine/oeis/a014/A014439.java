package irvine.oeis.a014;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014439 Differences between two positive cubes in exactly 1 way.
 * @author Sean A. Irvine
 */
public class A014439 implements Sequence {

  private long mN = 6;

  protected int ways() {
    return 1;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long lim = LongUtils.sqrt(mN / 3) + 1;
      int c = 0;
      for (long x = Z.valueOf(mN).root(3).longValueExact(); x <= lim; ++x) {
        final long x3 = x * x * x;
        if (x3 > mN) {
          final Z y = Z.valueOf(x3 - mN);
          y.root(3);
          if (y.auxiliary() != 0 && ++c > ways()) {
            break;
          }
        }
      }
      if (c == ways()) {
        return Z.valueOf(mN);
      }
    }
  }
}

