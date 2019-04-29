package irvine.oeis.a020;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020685 Numbers of form <code>5 x^2 + 6 y^2</code>.
 * @author Sean A. Irvine
 */
public class A020685 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long s = 0; 5 * s * s <= mN; ++s) {
        final long t = mN - 5 * s * s;
        if (t % 6 == 0) {
          final long u = t / 6;
          final long v = LongUtils.sqrt(u);
          if (v * v == u) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
