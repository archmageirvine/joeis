package irvine.oeis.a028;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A028967 Theta series of a.c.c. lattice.
 * @author Sean A. Irvine
 */
public class A028967 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    long cnt = 0;
    final long lim = LongUtils.sqrt(mN);
    for (long z = -lim; z <= lim; ++z) {
      final long a = 2 * z * z;
      for (long y = -lim; y <= lim; ++y) {
        final long b = a + 2 * y * y + 2 * y * z;
        for (long x = -lim; x <= lim; ++x) {
          if (b + 2 * x * x + 2 * x * y + x * z == mN) {
            ++cnt;
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
