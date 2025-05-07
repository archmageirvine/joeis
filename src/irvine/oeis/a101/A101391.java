package irvine.oeis.a101;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A101391 Triangle read by rows: T(n,k) is the number of compositions of n into k parts x_1, x_2, ..., x_k such that gcd(x_1,x_2,...,x_k) = 1 (1&lt;=k&lt;=n).
 * @author Sean A. Irvine
 */
public class A101391 extends Sequence2 {

  private long mN = 1;
  private long mM = 1;

  protected Z t(final long n, final long k) {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final long d = dd.longValue();
      sum = sum.add(Binomial.binomial(n / d - 1, k - 1).multiply(Functions.MOBIUS.i(d)));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 2;
    }
    return t(mN, mM);
  }
}
