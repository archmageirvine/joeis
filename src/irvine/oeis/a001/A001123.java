package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A001123.
 * @author Sean A. Irvine
 */
public class A001123 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (!ZUtils.testPrimitiveRoot(Z.TWO, mP) && ZUtils.testPrimitiveRoot(Z.THREE, mP)) {
        return mP;
      }
    }
  }
}

