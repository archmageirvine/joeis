package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.factor.prime.Prime;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013603.
 * @author Sean A. Irvine
 */
public class A013603 implements Sequence {

  private Prime mPrime = new Fast();
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
