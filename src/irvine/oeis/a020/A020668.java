package irvine.oeis.a020;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020668 Numbers of the form x^2 + 4*y^2.
 * @author Sean A. Irvine
 */
public class A020668 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long s = 0; s * s <= mN; ++s) {
        final long t = mN - s * s;
        if ((t & 3) == 0) {
          final long u = t >> 2;
          final long v = LongUtils.sqrt(u);
          if (v * v == u) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
