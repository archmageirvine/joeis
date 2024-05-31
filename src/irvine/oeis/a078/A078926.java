package irvine.oeis.a078;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078926 Number of primitive Pythagorean triangles with perimeter 2n.
 * @author Sean A. Irvine
 */
public class A078926 extends Sequence1 {

  protected long mN = 0;

  @Override
  public Z next() {
    long c = 0;
    final long lower = Functions.SQRT.l(++mN);
    final long upper = Functions.SQRT.l(2 * mN - 1);
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final long d = dd.longValueExact();
      if ((d & 1) == 1 && lower < d && d <= upper && Functions.GCD.l(d, mN / d) == 1) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
