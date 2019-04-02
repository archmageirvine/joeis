package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A007348 Primes for which -10 is a primitive root.
 * @author Sean A. Irvine
 */
public class A007348 implements Sequence {

  private static final Z Z10 = Z.TEN.negate();
  private Z mP = Z.TWO;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP.gcd(Z.TEN).equals(Z.ONE) && ZUtils.testPrimitiveRoot(Z10, mP)) {
        return mP;
      }
    }
  }
}
