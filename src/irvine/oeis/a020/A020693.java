package irvine.oeis.a020;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020693 Numbers of form 8 x^2 + 9 y^2.
 * @author Sean A. Irvine
 */
public class A020693 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long s = 0; 8 * s * s <= mN; ++s) {
        final long t = mN - 8 * s * s;
        if (t % 9 == 0) {
          final long u = t / 9;
          final long v = LongUtils.sqrt(u);
          if (v * v == u) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
