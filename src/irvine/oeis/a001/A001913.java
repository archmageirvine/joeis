package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A001913 Full reptend primes: primes with primitive root 10.
 * @author Sean A. Irvine
 */
public class A001913 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.FIVE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (ZUtils.testPrimitiveRoot(Z.TEN, mP)) {
        return mP;
      }
    }
  }
}
