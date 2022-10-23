package irvine.oeis.a054;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054273 Number of primes p in the interval prime(n+1) &lt;= p &lt; prime(n+1)^2 such that A002110(n)+p is prime.
 * @author Sean A. Irvine
 */
public class A054273 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mPrimorial = Z.ONE;
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    mPrimorial = mPrimorial.multiply(mP);
    mP = mPrime.nextPrime(mP);
    final Z p2 = mP.square();
    long cnt = 0;
    for (Z q = mP; q.compareTo(p2) < 0; q = mPrime.nextPrime(q)) {
      if (mPrimorial.add(q).isProbablePrime()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
