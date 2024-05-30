package irvine.oeis.a028;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028968 Numbers represented by quadratic form with Gram matrix [ 2, 1, 1; 1, 2, 1; 1, 1, 3 ].
 * @author Sean A. Irvine
 */
public class A028968 extends Sequence1 {

  private long mN = -1;

  private boolean isRepresentable(final long n) {
    final long lim = Functions.SQRT.l(n);
    for (long z = -lim; z <= lim; ++z) {
      final long a = 3 * z * z;
      for (long y = -lim; y <= lim; ++y) {
        final long b = a + 2 * y * y + 2 * y * z;
        for (long x = -lim; x <= lim; ++x) {
          if (b + 2 * x * x + 2 * x * y + 2 * x * z == n) {
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
