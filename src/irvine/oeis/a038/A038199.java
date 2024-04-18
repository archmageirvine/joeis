package irvine.oeis.a038;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038199 Row sums of triangle T(m,n) = number of solutions to 1 &lt;= a(1) &lt; a(2) &lt; ... &lt; a(m) &lt;= n, where gcd(a(1), a(2), ..., a(m), n) = 1, in A020921.
 * @author Sean A. Irvine
 */
public class A038199 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Z.ONE.shiftLeft(d).subtract(1).multiply(Functions.MOBIUS.i((long) (mN / d))));
    }
    return sum;
  }
}
