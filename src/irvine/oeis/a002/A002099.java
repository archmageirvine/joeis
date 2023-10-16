package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002099 G.f.: -1 + Product_{k&gt;=1} (1 + prime(k)*x^prime(k)).
 * @author Sean A. Irvine
 */
public class A002099 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Fast mPrime = new Fast();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ZERO;
    }
    Polynomial<Z> prod = RING.one();
    long p = 2;
    for (int k = 1; k <= mN; ++k, p = mPrime.nextPrime(p)) {
      prod = RING.multiply(prod, RING.onePlusXToTheN(Z.valueOf(p), (int) p), mN);
    }
    return prod.coeff(mN);
  }
}
