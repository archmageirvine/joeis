package irvine.oeis.a333;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A333941 Triangle read by rows where T(n,k) is the number of compositions of n with rotational period k.
 * @author Gregory Morse
 */
public class A333941 extends Triangle {
  @Override
  protected Z compute(final int n, final int k) {
    if (k == 0) {
      return n == 0 ? Z.ONE : Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (final Z divisor : Jaguar.factor(n).divisors()) {
      final int m = divisor.intValueExact();
      for (final Z dd : Jaguar.factor(Functions.GCD.i(k, m)).divisors()) {
        final int d = dd.intValueExact();
        sum = sum.add(Binomial.binomial(m / d - 1, k / d - 1).multiply(Functions.MOBIUS.i(d)));
      }
    }
    return sum;
  }
}
