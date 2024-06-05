package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034743 a(n) = Sum_{d | n} mu(n/d) * Bell(d-1).
 * @author Sean A. Irvine
 */
public class A034743 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Functions.BELL.z(d - 1).multiply(Functions.MOBIUS.i(mN / d)));
    }
    return sum;
  }
}
