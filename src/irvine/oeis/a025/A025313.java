package irvine.oeis.a025;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A025313 Numbers that are the sum of 2 distinct nonzero squares in 3 or more ways.
 * @author Sean A. Irvine
 */
public class A025313 extends Sequence1 {

  private long mN = 1;

  protected int ways() {
    return 3;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long lim = Functions.SQRT.l(mN / 2);
      int c = 0;
      for (long x = 1; x <= lim; ++x) {
        final long x2 = x * x;
        final long y2 = mN - x2;
        if (y2 != x2) {
          final long y = Functions.SQRT.l(y2);
          if (y * y == y2 && ++c >= ways()) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}

