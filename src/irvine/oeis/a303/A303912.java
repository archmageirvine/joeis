package irvine.oeis.a303;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A303912 Array read by antidiagonals: T(n,k) is the number of (planar) unlabeled k-ary cacti having n polygons.
 * @author Sean A. Irvine
 */
public class A303912 extends Sequence0 {

  private long mN = 0;
  private long mM = 0;

  protected Z t(final long n, final long k) {
    if (n <= 1 || k == 1) {
      return Z.ONE;
    }
    Z sum = Z.ONE;
    final Z zn = Z.valueOf(n);
    for (final Z d : Jaguar.factor(n).divisors()) {
      sum = sum.add(Functions.PHI.z(zn.divide(d)).multiply(Binomial.binomial(d.multiply(k), d)));
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
