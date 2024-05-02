package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069457.
 * @author Sean A. Irvine
 */
public class A069489 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1000;

  private boolean is(final long p) {
    long q = p;
    while (q >= 100) {
      if (!mPrime.isPrime(q % 1000)) {
        return false;
      }
      q /= 10;
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (is(mP)) {
        return Z.valueOf(mP);
      }
    }
  }
}

