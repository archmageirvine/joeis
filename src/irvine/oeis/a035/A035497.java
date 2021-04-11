package irvine.oeis.a035;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a007.A007770;

/**
 * A035497 Happy primes: primes that eventually reach 1 under iteration of "x -&gt; sum of squares of digits of x".
 * @author Sean A. Irvine
 */
public class A035497 extends A007770 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.FIVE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (isHappy(mP)) {
        return mP;
      }
    }
  }
}

