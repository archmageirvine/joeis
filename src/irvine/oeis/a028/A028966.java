package irvine.oeis.a028;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028966 Norms of vectors in the a.c.c. lattice, divided by 2.
 * @author Sean A. Irvine
 */
public class A028966 implements Sequence {

  private long mN = -1;

  private boolean isRepresentable(final long n) {
    final long lim = LongUtils.sqrt(n);
    for (long z = -lim; z <= lim; ++z) {
      final long a = 2 * z * z;
      for (long y = -lim; y <= lim; ++y) {
        final long b = a + 2 * y * y + 2 * y * z;
        for (long x = -lim; x <= lim; ++x) {
          if (b + 2 * x * x + 2 * x * y + x * z == n) {
            return true;
          }
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (isRepresentable(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
