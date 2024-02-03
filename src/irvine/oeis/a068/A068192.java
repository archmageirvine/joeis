package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068192.
 * @author Sean A. Irvine
 */
public class A068192 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.EIGHT;
      return Z.TWO;
    }
    final Z t = mA.subtract(mPrime.prevPrime(mA.subtract(1)));
    mA = mA.multiply(t);
    return t;
  }
}
