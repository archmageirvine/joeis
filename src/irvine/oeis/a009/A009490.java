package irvine.oeis.a009;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009490.
 * @author Sean A. Irvine
 */
public class A009490 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> DEN = RING.oneMinusXToTheN(1);
  private final Fast mPrime = new Fast();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> num = RING.one();
    for (long p = 2; p <= mN; p = mPrime.nextPrime(p)) {
      Polynomial<Z> t = RING.one();
      long q = p;
      do {
        t = RING.add(t, RING.monomial(Z.ONE, (int) q));
        q *= p;
      } while (q <= mN);
      num = RING.multiply(num, t, mN);
    }
    return RING.coeff(num, DEN, mN);
  }
}
