package irvine.oeis.a014;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014452 Theta series of quadratic form with Gram matrix [ 1, 0, 0; 0, 2, 1; 0, 1, 2 ].
 * @author Sean A. Irvine
 */
public class A014452 extends Sequence0 {

  // Inefficient

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    final long lim = LongUtils.sqrt(mN);
    for (long z = -lim; z <= lim; ++z) {
      final long a = z * z;
      for (long y = -lim; y <= lim; ++y) {
        final long b = a + 2 * y * y;
        for (long x = -lim; x <= lim; ++x) {
          final long c = b + 2 * x * x;
          final long d = 2 * x * y;
          if (c + d == mN) {
            ++cnt;
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
