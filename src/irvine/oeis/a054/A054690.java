package irvine.oeis.a054;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054690 n consecutive primes differ by 4 or more starting at a(n), or n consecutive primes with no twin primes.
 * @author Sean A. Irvine
 */
public class A054690 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 2;
  private int mN = 0;

  private int cnt(long p) {
    if (p - mPrime.prevPrime(p) >= 4) {
      return 0;
    }
    int cnt = 0;
    while (true) {
      final long q = p;
      p = mPrime.nextPrime(p);
      if (p - q < 4) {
        return cnt;
      }
      ++cnt;
    }
  }


  @Override
  public Z next() {
    ++mN;
    while (cnt(mP) < mN) {
      mP = mPrime.nextPrime(mP);
    }
    return Z.valueOf(mP);
  }
}

