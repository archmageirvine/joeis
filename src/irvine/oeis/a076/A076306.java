package irvine.oeis.a076;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076306 Numbers k such that k^3 is a sum of three successive primes.
 * @author Sean A. Irvine
 */
public class A076306 extends Sequence1 {

  // After Chai Wah Wu

  private final Fast mPrime = new Fast();
  private long mN = 10;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN).pow(3);
      final Z m = t.divide(3);
      final Z pm = mPrime.prevPrime(m);
      final Z nm = mPrime.nextPrime(m);
      final Z k = t.subtract(pm).subtract(nm);
      if (mPrime.isPrime(m)) {
        if (k.equals(m)) {
          return Z.valueOf(mN);
        }
      } else if (mPrime.nextPrime(nm).equals(k) || mPrime.prevPrime(pm).equals(k)) {
        return Z.valueOf(mN);
      }
    }
  }
}
