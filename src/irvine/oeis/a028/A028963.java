package irvine.oeis.a028;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A028963 Theta series of quadratic form with Gram matrix [ 2, 1, 0; 1, 3, 1; 0, 1, 5 ].
 * @author Sean A. Irvine
 */
public class A028963 extends Sequence0 {

  // Inefficient

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    final long lim = LongUtils.sqrt(mN);
    for (long z = -lim; z <= lim; ++z) {
      final long a = 5 * z * z;
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
