package irvine.oeis.a023;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023187 Distances of increasingly lonely primes to nearest prime.
 * @author Sean A. Irvine
 */
public class A023187 extends Sequence1 {

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
          return Z.valueOf(mD);
        }
      }
    }
  }
}

