package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A001122 Primes with primitive root 2.
 * @author Sean A. Irvine
 */
public class A001122 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (ZUtils.isPrimitiveRoot(Z.TWO, mP)) {
        return mP;
      }
    }
  }
}

