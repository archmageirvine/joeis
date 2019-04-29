package irvine.oeis.a020;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020694.
 * @author Sean A. Irvine
 */
public class A020694 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long s = 0; 9 * s * s <= mN; ++s) {
        final long t = mN - 9 * s * s;
        if (t % 10 == 0) {
          final long u = t / 10;
          final long v = LongUtils.sqrt(u);
          if (v * v == u) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
