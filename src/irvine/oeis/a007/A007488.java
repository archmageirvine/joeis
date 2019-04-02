package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A007488 Primes whose reversal is a square.
 * @author Sean A. Irvine
 */
public class A007488 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.valueOf(60);

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (Z.ZERO.equals(ZUtils.reverse(mP).sqrtAndRemainder()[1])) {
        return mP;
      }
    }
  }
}
