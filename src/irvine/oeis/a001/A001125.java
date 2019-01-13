package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A001125.
 * @author Sean A. Irvine
 */
public class A001125 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (Z.SIX.equals(ZUtils.leastPrimitiveRoot(mP))) {
        return mP;
      }
    }
  }
}

