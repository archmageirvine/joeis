package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A001124 Primes with 5 as smallest primitive root.
 * @author Sean A. Irvine
 */
public class A001124 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (Z.FIVE.equals(ZUtils.leastPrimitiveRoot(mP))) {
        return mP;
      }
    }
  }
}

