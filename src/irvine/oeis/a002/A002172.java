package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002172.
 * @author Sean A. Irvine
 */
public class A002172 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(IntegerField.SINGLETON);
  private final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    do {
      mP = mPrime.nextPrime(mP);
    } while ((mP & 3) != 1);
    final int n = (int) (mP >>> 2);
    Polynomial<Z> p = RING.one();
    for (int k = 1; k <= n; ++k) {
      p = RING.multiply(p, RING.oneMinusXToTheN(k), n);
      p = RING.multiply(p, RING.oneMinusXToTheN(2 * k), n);
    }
    return RING.pow(p, 2, n).coeff(n);
  }
}
