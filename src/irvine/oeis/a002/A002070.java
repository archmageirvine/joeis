package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002070 Coefficient of x^p (p = n-th prime) in <code>x *</code> Product_{k&gt;=1} <code>(1-x^k)^2*(1-x^11k)^2</code>.
 * @author Sean A. Irvine
 */
public class A002070 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private long mP = 1;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    if (mP > Integer.MAX_VALUE) {
      throw new UnsupportedOperationException();
    }
    final int p = (int) mP;
    Polynomial<Z> gf = RING.one();
    for (int k = 1; k <= p; ++k) {
      gf = RING.multiply(gf, RING.oneMinusXToTheN(k), p);
      if (11 * k <= p) {
        gf = RING.multiply(gf, RING.oneMinusXToTheN(11 * k), p);
      }
    }
    gf = RING.pow(gf, 2, p);
    return gf.coeff(p - 1);
  }
}

