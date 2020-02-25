package irvine.oeis.a028;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028962 Numbers represented by quadratic form with Gram matrix <code>[ 2, 1, 0; 1, 3, 1; 0, 1, 5 ]</code>.
 * @author Sean A. Irvine
 */
public class A028962 implements Sequence {

  // Inefficient

  private long mN = -1;

  private boolean isRepresentable(final long n) {
    final long lim = LongUtils.sqrt(n);
    for (long z = -lim; z <= lim; ++z) {
      final long a = 5 * z * z;
      for (long y = -lim; y <= lim; ++y) {
        final long b = a + 3 * y * y;
        for (long x = -lim; x <= lim; ++x) {
          if (b + 2 * x * x + 2 * x * y + 2 * y * z == n) {
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
