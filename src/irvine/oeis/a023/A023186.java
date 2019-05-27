package irvine.oeis.a023;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023186 Lonely (or isolated) primes: increasing distance to nearest prime.
 * @author Sean A. Irvine
 */
public class A023186 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mD = 0;
  private long mP = 1;

  @Override
  public Z next() {
    while (true) {
      final long prev = mP;
      mP = mPrime.nextPrime(mP);
      if (mP - prev > mD) {
        final long next = mPrime.nextPrime(mP);
        if (next - mP > mD) {
          mD = Math.min(mP - prev, next - mP);
          return Z.valueOf(mP);
        }
      }
    }
  }
}

