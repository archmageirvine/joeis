package irvine.oeis.a028;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028972 Numbers represented by quadratic form with Gram matrix [ 7, 1, -3; 1, 3, 1; -3, 1, 7 ].
 * @author Sean A. Irvine
 */
public class A028972 extends Sequence1 {

  private long mN = -1;

  private boolean isRepresentable(final long n) {
    final long lim = Functions.SQRT.l(n);
    for (long z = -lim; z <= lim; ++z) {
      final long a = 7 * z * z;
      for (long y = -lim; y <= lim; ++y) {
        final long b = a + 3 * y * y + 2 * y * z;
        for (long x = -lim; x <= lim; ++x) {
          if (b + 7 * x * x + 2 * x * y - 6 * x * z == n) {
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
