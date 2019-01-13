package irvine.oeis.a014;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014133.
 * @author Sean A. Irvine
 */
public class A014133 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      long t;
      for (long k = 0; (t = k * (k + 1) / 2) <= mN; ++k) {
        final long m = mN - t;
        final long s = LongUtils.sqrt(m);
        if (s * s == m) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
