package irvine.oeis.a085;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A085012 For p = prime(n), a(n) is the smallest prime q such that pq is a base-2 pseudoprime; that is, 2^(pq-1) = 1 mod pq; a(n) is 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A085012 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private static final Z Z13 = Z.valueOf(13);
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    if (mP.compareTo(Z.SEVEN) <= 0 || mP.equals(Z13)) {
      return Z.ZERO;
    }
    long q = 7;
    while (true) {
      q = mPrime.nextPrime(q);
      final Z pq = mP.multiply(q);
      if (Z.TWO.modPow(pq.subtract(1), pq).isOne()) {
        return Z.valueOf(q);
      }
    }
  }
}
