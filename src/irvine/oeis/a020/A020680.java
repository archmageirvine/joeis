package irvine.oeis.a020;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020680 Numbers of form 3 x^2 + 8 y^2.
 * @author Sean A. Irvine
 */
public class A020680 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long s = 0; 3 * s * s <= mN; ++s) {
        final long t = mN - 3 * s * s;
        if ((t & 7) == 0) {
          final long u = t >> 3;
          final long v = LongUtils.sqrt(u);
          if (v * v == u) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
