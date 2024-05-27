package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069866 Primes in which repeatedly deleting the most significant digit then the least significant digit gives a prime at every step until a single-digit prime remains.
 * @author Sean A. Irvine
 */
public class A069866 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mM = 10;

  private boolean is(long p) {
    boolean left = false;
    long m = mM / 10;
    while (m > 1) {
      left = !left;
      if (left) {
        p = p % m;
      } else {
        p = p / 10;
      }
      if (!mPrime.isPrime(p)) {
        return false;
      }
      m /= 10;
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP > mM) {
        mM *= 10;
      }
      if (is(mP)) {
        return Z.valueOf(mP);
      }
    }
  }
}

