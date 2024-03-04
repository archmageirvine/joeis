package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068603 Numbers n such that prime(n)+prime(2n)+prime(3n) is prime.
 * @author Sean A. Irvine
 */
public class A068603 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mQ = 1;
  private long mR = 1;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mP = mPrime.nextPrime(mP);
      mQ = mPrime.nextPrime(mPrime.nextPrime(mQ));
      mR = mPrime.nextPrime(mPrime.nextPrime(mPrime.nextPrime(mR)));
      if (mPrime.isPrime(mR + mQ + mP)) {
        return Z.valueOf(mN);
      }
    }
  }
}
