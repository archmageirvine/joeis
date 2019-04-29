package irvine.oeis.a020;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020689.
 * @author Sean A. Irvine
 */
public class A020689 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long s = 0; 6 * s * s <= mN; ++s) {
        final long t = mN - 6 * s * s;
        if (t % 7 == 0) {
          final long u = t / 7;
          final long v = LongUtils.sqrt(u);
          if (v * v == u) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
