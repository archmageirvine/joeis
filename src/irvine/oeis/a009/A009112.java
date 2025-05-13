package irvine.oeis.a009;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A009112 Areas of Pythagorean triangles: numbers which can be the area of a right triangle with integer sides.
 * @author Sean A. Irvine
 */
public class A009112 extends Sequence1 {

  private Z mN = Z.FOUR;

  /**
   * Test if the given value is a possible area of a Pythagorean triangle.
   * @param area area
   * @return true if the area is Pythagorean
   */
  public static boolean is(final Z area) {
    final long[] d = ZUtils.toLong(Jaguar.factor(area.multiply2()).divisors());
    for (int k = 0; k <= d.length / 2; ++k) {
      final long t2 = d[k] * d[k] + d[d.length - k - 1] * d[d.length - k - 1];
      final long t = Functions.SQRT.l(t2);
      if (t * t == t2) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (is(mN)) {
        return mN;
      }
    }
  }
}
