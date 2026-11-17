package irvine.oeis.a087;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087418 Consider pairs (p,k) such that p is a prime, q and r are the two primes following p, 0&lt;k&lt;q and k*primorial(p)+q and k*primorial(p)+r are consecutive primes; sequence gives values of p.
 * @author Sean A. Irvine
 */
public class A087418 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 2;
  private Z mPrimorial = Z.TWO;
  private long mK = 0;

  @Override
  public Z next() {
    while (true) {
      final long q = mPrime.nextPrime(mP);
      if (++mK >= q) {
        mP = mPrime.nextPrime(mP);
        mPrimorial = mPrimorial.multiply(mP);
        mK = 0;
      } else {
        final Z kp = mPrimorial.multiply(mK);
        if (kp.add(q).isProbablePrime()) {
          final long r = mPrime.nextPrime(q);
          if (kp.add(r).isProbablePrime()) {
            return Z.valueOf(mP);
          }
        }
      }
    }
  }
}
