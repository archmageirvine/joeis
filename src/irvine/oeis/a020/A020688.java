package irvine.oeis.a020;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020688 Numbers of form <code>5 x^2 + 9 y^2</code>.
 * @author Sean A. Irvine
 */
public class A020688 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long s = 0; 5 * s * s <= mN; ++s) {
        final long t = mN - 5 * s * s;
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
