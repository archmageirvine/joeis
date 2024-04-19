package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.factor.prime.Prime;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A013603 Difference between 2^n and the nearest prime less than or equal to 2^n.
 * @author Sean A. Irvine
 */
public class A013603 extends Sequence1 {

  private final Prime mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return Z.ZERO;
    }
    mA = mA.multiply2();
    return mA.subtract(mPrime.prevPrime(mA));
  }
}
