package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391905 Numbers which are the hypotenuse of a primitive Pythagorean quadruple whose legs are also members of a smaller primitive Pythagorean quadruple.
 * @author Sean A. Irvine
 */
public class A391905 extends Sequence1 {

  private long mN = 48;

  private boolean is(final long h) {
    for (long x = 1; 3 * x * x <= h * h; ++x) {
      for (long y = x; 2 * y * y <= h * h - x * x; ++y) {
        final long z2 = h * h - x * x - y * y;
        final long z = Functions.SQRT.l(z2);
        if (z * z == z2 && Functions.GCD.l(h, x, y, z) == 1) {
          final long w2 = z * z - y * y - x * x;
          final long w = Functions.SQRT.l(w2);
          if (w * w == w2 && Functions.GCD.l(w, x, y, z) == 1) {
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
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
