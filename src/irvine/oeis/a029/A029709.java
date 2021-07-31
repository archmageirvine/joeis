package irvine.oeis.a029;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029709 Numbers k such that k-th and (k+1)st primes differ by 4.
 * @author Sean A. Irvine
 */
public class A029709 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.FIVE;
  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mP = mPrime.nextPrime(mP);
      if (mPrime.isPrime(mP.add(4))) {
        return Z.valueOf(mN);
      }
    }
  }
}
