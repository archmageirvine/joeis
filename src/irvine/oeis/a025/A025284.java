package irvine.oeis.a025;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025284 Numbers that are the sum of 2 nonzero squares in exactly 1 way.
 * @author Sean A. Irvine
 */
public class A025284 implements Sequence {

  private long mN = 1;

  protected int ways() {
    return 1;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long lim = LongUtils.sqrt(mN / 2);
      int c = 0;
      for (long x = 1; x <= lim; ++x) {
        final long y2 = mN - x * x;
        final long y = LongUtils.sqrt(y2);
        if (y * y == y2 && ++c > ways()) {
          break;
        }
      }
      if (c == ways()) {
        return Z.valueOf(mN);
      }
    }
  }
}

