package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A001126.
 * @author Sean A. Irvine
 */
public class A001126 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (Z.SEVEN.equals(ZUtils.leastPrimitiveRoot(mP))) {
        return mP;
      }
    }
  }
}

