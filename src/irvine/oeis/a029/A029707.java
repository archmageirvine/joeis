package irvine.oeis.a029;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029707 Numbers k such that the k-th and the (k+1)-st primes are twin primes.
 * @author Sean A. Irvine
 */
public class A029707 extends Sequence1 {

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
