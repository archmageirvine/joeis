package irvine.oeis.a024;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
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
      final long n = ++mN;
      final long lower = Functions.SQRT.l(n);
      final long upper = Functions.SQRT.l(2 * mN - 1);
      for (final Z dd : Jaguar.factor(mN).divisors()) {
        final long d = dd.longValueExact();
        if ((d & 1) == 1 && lower < d && d <= upper && Functions.GCD.l(d, mN / d) == 1 && ++c > 1) {
          return Z.valueOf(2 * mN);
        }
      }
    }
  }
}
