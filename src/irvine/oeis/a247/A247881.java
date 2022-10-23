package irvine.oeis.a247;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A247881 Numbers of the form x^2 + 13y^2.
 * @author Sean A. Irvine
 */
public class A247881 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long s = 0; s * s <= mN; ++s) {
        final long t = mN - s * s;
        if (t % 13 == 0) {
          final long u = t / 13;
          final long v = LongUtils.sqrt(u);
          if (v * v == u) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
