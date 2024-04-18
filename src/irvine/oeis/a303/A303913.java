package irvine.oeis.a303;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A303913 Array read by antidiagonals: T(n,k) is the number of (planar) unlabeled asymmetric k-ary cacti having n polygons.
 * @author Sean A. Irvine
 */
public class A303913 extends Sequence0 {

  private long mN = 0;
  private long mM = 0;

  protected Z t(final long n, final long k) {
    if (n <= 1) {
      return Z.ONE;
    }
    if (k == 1 || n == 2) {
      return Z.ZERO;
    }
    Z sum = Z.ONE;
    for (final Z d : Jaguar.factor(n).divisors()) {
      sum = sum.add(Binomial.binomial(d.multiply(k), d).multiply(Functions.MOBIUS.i(n / d.longValue())));
    }
    sum = sum.divide(n);
    return sum.subtract(Binomial.binomial(k * n, n).multiply(k - 1).divide((k - 1) * n + 1));
  }

  @Override
  public Z next() {
    if (--mM < 1) {
      mM = ++mN;
    }
    return t(mN - mM, mM);
  }
}
