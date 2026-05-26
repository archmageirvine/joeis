package irvine.oeis.a085;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A085014 For p = prime(n), a(n) is the number of primes q such that pq is a base-2 pseudoprime; that is, 2^(pq-1) = 1 mod pq.
 * @author Sean A. Irvine
 */
public class A085014 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long cnt = 0;
    for (final Z q : Jaguar.factor(Z.TWO.pow(mP.subtract(1)).subtract(1)).toZArray()) {
      final Z pq = mP.multiply(q);
      if (Z.TWO.modPow(pq.subtract(1), pq).isOne()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
