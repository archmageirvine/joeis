package irvine.oeis.a024;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024408 Perimeters of more than one primitive Pythagorean triangle.
 * @author Sean A. Irvine
 */
public class A024408 extends Sequence1 {

  protected long mN = 0;

  @Override
  public Z next() {
    while (true) {
      long c = 0;
      final long lower = LongUtils.sqrt(++mN);
      final long upper = LongUtils.sqrt(2 * mN - 1);
      for (final Z dd : Jaguar.factor(mN).divisors()) {
        final long d = dd.longValueExact();
        if ((d & 1) == 1 && lower < d && d <= upper && LongUtils.gcd(d, mN / d) == 1 && ++c > 1) {
          return Z.valueOf(2 * mN);
        }
      }
    }
  }
}
