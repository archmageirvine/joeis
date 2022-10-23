package irvine.oeis.a014;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014456 Numbers represented by quadratic form with Gram matrix [ 2, 1, 0; 1, 3, 1; 0, 1, 2 ].
 * @author Sean A. Irvine
 */
public class A014456 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final long max = LongUtils.sqrt(++mN / 2);
      for (long x = -max; x <= max; ++x) {
        final long t = 2 * x * x;
        for (long y = -max; y <= max; ++y) {
          final long u = t + 2 * x * y + 3 * y * y;
          for (long z = -max; z <= max; ++z) {
            final long v = u + 2 * y * z + 2 * z * z;
            if (v == mN) {
              return Z.valueOf(mN);
            }
          }
        }
      }
    }
  }
}
