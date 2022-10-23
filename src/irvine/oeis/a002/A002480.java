package irvine.oeis.a002;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002480 Numbers of form 2x^2 + 3y^2.
 * @author Sean A. Irvine
 */
public class A002480 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long q = 0, r; (r = mN - 3 * q * q) >= 0; ++q) {
        if ((r & 1) == 0) {
          final long t = r >>> 1;
          final long y = LongUtils.sqrt(t);
          if (y * y == t) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
