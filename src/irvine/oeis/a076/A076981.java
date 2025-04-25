package irvine.oeis.a076;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076981 Smallest k such that n*(n+1)*(n+2)*...*(n+k) is divisible by the product of primes up to n.
 * @author Sean A. Irvine
 */
public class A076981 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private Z mProdPrimes = Z.ONE;
  private long mP = 2;

  @Override
  public Z next() {
    if (++mN == mP) {
      mProdPrimes = mProdPrimes.multiply(mP);
      mP = mPrime.nextPrime(mP);
    }
    long k = 0;
    long s = mN;
    Z m = Z.ONE;
    while (true) {
      m = m.modMultiply(s, mProdPrimes);
      if (m.isZero()) {
        return Z.valueOf(k);
      }
      ++s;
      ++k;
    }
  }
}

