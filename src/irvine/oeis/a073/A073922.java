package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073922 a(1) = 1, a(n) = smallest composite number greater than n and not occurring earlier if n is prime, or smallest prime number greater than n and not occurring earlier if n is composite.
 * @author Sean A. Irvine
 */
public class A073922 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mP = 2;
  private long mC = 3;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    if (mPrime.isPrime(mN)) {
      while (true) {
        ++mC;
        if (mC > mN && !mPrime.isPrime(mC)) {
          return Z.valueOf(mC);
        }
      }
    }
    do {
      mP = mPrime.nextPrime(mP);
    } while (mP < mN);
    return Z.valueOf(mP);
  }
}

