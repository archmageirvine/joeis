package irvine.oeis.a014;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014663 Primes p such that multiplicative order of 2 modulo p is odd.
 * @author Sean A. Irvine
 */
public class A014663 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (new IntegersModMul(mP).order(Z.TWO).isOdd()) {
        return mP;
      }
    }
  }
}

