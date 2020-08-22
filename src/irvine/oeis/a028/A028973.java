package irvine.oeis.a028;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028973 Theta series of quadratic form with Gram matrix [ 7, 1, -3; 1, 3, 1; -3, 1, 7 ].
 * @author Sean A. Irvine
 */
public class A028973 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    long cnt = 0;
    final long lim = LongUtils.sqrt(mN);
    for (long z = -lim; z <= lim; ++z) {
      final long a = 7 * z * z;
      for (long y = -lim; y <= lim; ++y) {
        final long b = a + 3 * y * y + 2 * y * z;
        for (long x = -lim; x <= lim; ++x) {
          if (b + 7 * x * x + 2 * x * y - 6 * x * z == mN) {
            ++cnt;
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
