package irvine.oeis.a000;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000592 Number of nonnegative solutions of <code>x^2 + y^2 = z</code> in first n shells.
 * @author Sean A. Irvine
 */
public class A000592 implements Sequence {

  private long mN = -1;
  private long mPrev = 0;

  @Override
  public Z next() {
    long c;
    do {
      ++mN;
      c = 0;
      final long lim = LongUtils.sqrt(mN);
      for (long x = 0; x <= lim; ++x) {
        for (long y = x; y <= lim; ++y) {
          if (x * x + y * y - mN <= 0) {
            if (y == x) {
              ++c;
            } else {
              c += 2;
            }
          }
        }
      }
    } while (c == mPrev);
    mPrev = c;
    return Z.valueOf(c);
  }
}

