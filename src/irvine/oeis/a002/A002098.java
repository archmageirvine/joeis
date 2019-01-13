package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002098.
 * @author Sean A. Irvine
 */
public class A002098 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Fast mPrime = new Fast();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> den = RING.one();
    long p = 2;
    for (int k = 1; k <= mN && p <= mN; ++k, p = mPrime.nextPrime(p)) {
      den = RING.multiply(den, RING.oneMinusXToTheN(Z.valueOf(p), (int) p), mN);
    }
    return RING.coeff(RING.one(), den, mN);
  }
}
