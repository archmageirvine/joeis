package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000592 Number of nonnegative solutions of x^2 + y^2 = z in first n shells.
 * @author Sean A. Irvine
 */
public class A000592 extends Sequence0 {

  private long mN = -1;
  private long mPrev = 0;

  @Override
  public Z next() {
    long c;
    do {
      ++mN;
      c = 0;
      final long lim = Functions.SQRT.l(mN);
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

