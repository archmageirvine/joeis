package irvine.oeis.a025;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025294.
 * @author Sean A. Irvine
 */
public class A025294 implements Sequence {

  private long mN = 1;

  protected int ways() {
    return 3;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      int c = 0;
      for (long x = 1; x * x <= mN / 2; ++x) {
        final long y2 = mN - x * x;
        final long y = LongUtils.sqrt(y2);
        if (y * y == y2 && ++c >= ways()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

