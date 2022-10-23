package irvine.oeis.a055;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055393 Sum of a square and a nonnegative cube in more than one way.
 * @author Sean A. Irvine
 */
public class A055393 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      int cnt = 0;
      for (long k = 0, t; (t = mN - k * k * k) >= 0; ++k) {
        final long s = LongUtils.sqrt(t);
        if (s * s == t && ++cnt > 1) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
