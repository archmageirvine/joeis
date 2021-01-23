package irvine.oeis.a028;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028974 Numbers represented by quadratic form with Gram matrix [ 3, 1, 0; 1, 3, 1; 0, 1, 3 ].
 * @author Sean A. Irvine
 */
public class A028974 implements Sequence {

  private long mN = -1;

  private boolean isRepresentable(final long n) {
    final long lim = LongUtils.sqrt(n);
    for (long z = -lim; z <= lim; ++z) {
      final long a = 3 * z * z;
      for (long y = -lim; y <= lim; ++y) {
        final long b = a + 3 * y * y + 2 * y * z;
        for (long x = -lim; x <= lim; ++x) {
          if (b + 3 * x * x + 2 * x * y == n) {
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
