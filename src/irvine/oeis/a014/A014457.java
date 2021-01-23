package irvine.oeis.a014;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014457 Theta series of quadratic form (or lattice) with Gram matrix [ 2, 1, 0; 1, 3, 1; 0, 1, 2 ].
 * @author Sean A. Irvine
 */
public class A014457 implements Sequence {

  // Inefficient

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    final long lim = LongUtils.sqrt(mN);
    for (long z = -lim; z <= lim; ++z) {
      final long a = 2 * z * z;
      for (long y = -lim; y <= lim; ++y) {
        final long b = a + 3 * y * y;
        for (long x = -lim; x <= lim; ++x) {
          final long c = b + 2 * x * x;
          final long d = 2 * x * y;
          final long e = 2 * y * z;
          if (c + d + e == mN) {
            ++cnt;
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
