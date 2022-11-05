package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A001123 Primes with 3 as smallest primitive root.
 * @author Sean A. Irvine
 */
public class A001123 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (!ZUtils.isPrimitiveRoot(Z.TWO, mP) && ZUtils.isPrimitiveRoot(Z.THREE, mP)) {
        return mP;
      }
    }
  }
}

