package irvine.oeis.a058;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058315 Apply inverse of "INVERT" transform to primes with prime exponents.
 * @author Sean A. Irvine
 */
public class A058315 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Fast mPrime = new Fast();
  private final Polynomial<Z> mA = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      mA.add(Z.ONE);
    } else if (mPrime.isPrime(mN)) {
      mA.add(Z.valueOf(mN));
    } else {
      mA.add(Z.ZERO);
    }
    return RING.coeff(RING.one(), mA, mN);
  }
}
