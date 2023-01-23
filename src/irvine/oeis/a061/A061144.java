package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061144 Sum of the areas of triangles whose vertices lie on the n X n grid with unit spacing as enumerated in A045996.
 * @author Sean A. Irvine
 */
public class A061144 extends Sequence1 {

  // After Nathaniel Johnston, https://oeis.org/A061144/a061144.c.txt

  private long mN = 0;

  private long triangleArea(final long a1, final long a2, final long b1, final long b2, final long c1, final long c2) {
    final long sd1 = (b1 - a1) * (b1 - a1) + (b2 - a2) * (b2 - a2);
    final long sd2 = (c1 - b1) * (c1 - b1) + (c2 - b2) * (c2 - b2);
    final long sd3 = (a1 - c1) * (a1 - c1) + (a2 - c2) * (a2 - c2);
    final long t1 = sd1 - sd3 - sd2;
    final long t2 = sd2 - sd1 - sd3;
    final long t3 = sd3 - sd1 - sd2;
    if (4 * sd1 * sd2 > t3 * t3 && 4 * sd2 * sd3 > t1 * t1 && 4 * sd1 * sd3 > t2 * t2) {
      return Math.abs((b1 - a1) * (c2 - a2) - (b2 - a2) * (c1 - a1));
    }
    return 0;
  }

  @Override
  public Z next() {
    Z sumArea = Z.ZERO;
    if (++mN > 1) {
      final long n2 = mN * mN;
      for (long a = 0; a < n2; ++a) {
        final long a1 = a % mN;
        final long a2 = a / mN;
        for (long b = a + 1; b < n2; ++b) {
          final long b1 = b % mN;
          final long b2 = b / mN;
          for (long c = b + 1; c < n2; ++c) {
            sumArea = sumArea.add(triangleArea(a1, a2, b1, b2, c % mN, c / mN));
          }
        }
      }
    }
    return sumArea.divide2();
  }
}
