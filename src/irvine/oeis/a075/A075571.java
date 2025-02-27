package irvine.oeis.a075;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075571 Rearrangement of odd primes such that sum of three successive terms is composite.
 * @author Sean A. Irvine
 */
public class A075571 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private final HashSet<Long> mUsed = new HashSet<>();
  private long mA = 0;
  private long mB = 0;

  @Override
  public Z next() {
    if (mB == 0) {
      if (mA == 0) {
        mA = 3;
        return Z.THREE;
      }
      mB = 5;
      return Z.FIVE;
    }
    long p = 5;
    while (true) {
      p = mPrime.nextPrime(p);
      if (!mPrime.isPrime(mA + mB + p) && mUsed.add(p)) {
        mA = mB;
        mB = p;
        return Z.valueOf(p);
      }
    }
  }
}

