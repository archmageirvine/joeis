package irvine.oeis.a014;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014662 Primes p such that order of 2 mod p (=A007733(p)) is even.
 * @author Sean A. Irvine
 */
public class A014662 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (new IntegersModMul(mP).order(Z.TWO).isEven()) {
        return mP;
      }
    }
  }
}

