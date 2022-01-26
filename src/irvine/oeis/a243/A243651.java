package irvine.oeis.a243;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A243651 Nonnegative integers of the form x^2+11y^2.
 * @author Sean A. Irvine
 */
public class A243651 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long s = 0; s * s <= mN; ++s) {
        final long t = mN - s * s;
        if (t % 11 == 0) {
          final long u = t / 11;
          final long v = LongUtils.sqrt(u);
          if (v * v == u) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
