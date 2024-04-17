package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069259 Limit of A069258(k,n) = number of partitions of 2*k into k-n prime parts, as k tends to infinity.
 * @author Sean A. Irvine
 */
public class A069259 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NEG_X = RING.negate(RING.x());
  private final Fast mPrime = new Fast();
  private int mN = -1;

  @Override
  public Z next() {
    final int m = 2 * ++mN;
    Polynomial<Z> f = RING.one();
    for (long p = 3; p <= m + 4; p = mPrime.nextPrime(p)) {
      f = RING.multiply(f, RING.oneMinusXToTheN((int) p - 2), m);
    }
    f = RING.series(RING.one(), f, m);
    return f.coeff(m).add(RING.substitute(f, NEG_X, m).coeff(m)).divide2();
  }
}
