package irvine.oeis.a025;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025017 a(n) = least 2k such that p is the least prime in a Goldbach partition of 2k, where p = prime(n).
 * @author Sean A. Irvine
 */
public class A025017 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  protected long gold(final long n) {
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      if (mPrime.isPrime(n - p)) {
        return p;
      }
    }
  }

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long n = 2 * mP;
    while (true) {
      if (mPrime.isPrime(n - mP) && gold(n) == mP) {
        return Z.valueOf(n);
      }
      n += 2;
    }
  }
}

