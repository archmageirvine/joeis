package irvine.oeis.a029;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029707 Numbers n such that the n-th and the <code>(n+1)-st</code> primes are twin primes.
 * @author Sean A. Irvine
 */
public class A029707 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mP = mPrime.nextPrime(mP);
      if (mPrime.isPrime(mP.add(2))) {
        return Z.valueOf(mN);
      }
    }
  }
}
