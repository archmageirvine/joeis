package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002095 Number of partitions of n into nonprime parts.
 * @author Sean A. Irvine
 */
public class A002095 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Fast mPrime = new Fast();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> num = RING.one();
    Polynomial<Z> den = RING.one();
    long p = 2;
    for (int k = 1; k <= mN; ++k, p = mPrime.nextPrime(p)) {
      num = RING.multiply(num, RING.oneMinusXToTheN((int) p), mN);
      den = RING.multiply(den, RING.oneMinusXToTheN(k), mN);
    }
    return RING.coeff(num, den, mN);
  }
}
