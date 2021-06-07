package irvine.oeis.a048;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048247 Every prime occurs to this power in some factorial.
 * @author Sean A. Irvine
 */
public class A048247 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Fast mPrime = new Fast();
  private int mN = -1;

  private Polynomial<Z> series(final int p, final int n) {
    Polynomial<Z> num = RING.one();
    Polynomial<Z> den = RING.one();
    for (int k = 1, pk = p, e; (e = (pk - 1) / (p -1)) <= n; ++k, pk *= p) {
      num = RING.multiply(num, RING.oneMinusXToTheN(p * e), n);
      den = RING.multiply(den, RING.oneMinusXToTheN(e), n);
    }
    return RING.series(num, den, n);
  }

  private boolean isOk(final int n) {
    for (int p = 2; p <= n; p = (int) mPrime.nextPrime(p)) {
      final Polynomial<Z> series = series(p, mN);
      if (series.coeff(n).isZero()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (isOk(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
