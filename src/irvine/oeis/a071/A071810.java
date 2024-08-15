package irvine.oeis.a071;

import irvine.factor.prime.Fast;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071810 Number of subsets of the first n primes whose sum is a prime.
 * @author Sean A. Irvine
 */
public class A071810 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final Fast mPrime = new Fast();
  private int mSumP = 0;
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    mSumP += mP;
    Polynomial<Z> gf = RING.one();
    for (long p = 2; p <= mP; p = mPrime.nextPrime(p)) {
      gf = RING.multiply(gf, RING.onePlusXToTheN((int) p), mSumP);
    }
    Z res = Z.ZERO;
    for (long p = 2; p <= mSumP; p = mPrime.nextPrime(p)) {
      res = res.add(gf.coeff((int) p));
    }
    return res;
  }
}
