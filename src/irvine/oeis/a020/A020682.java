package irvine.oeis.a020;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020682 Numbers of form 4 x^2 + 5 y^2.
 * @author Sean A. Irvine
 */
public class A020682 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long s = 0; 4 * s * s <= mN; ++s) {
        final long t = mN - 4 * s * s;
        if (t % 5 == 0) {
          final long u = t / 5;
          final long v = LongUtils.sqrt(u);
          if (v * v == u) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
