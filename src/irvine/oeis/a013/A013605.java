package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.factor.prime.Prime;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013605.
 * @author Sean A. Irvine
 */
public class A013605 implements Sequence {

  private Prime mPrime = new Fast();
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(5);
    return mA.subtract(mPrime.prevPrime(mA));
  }
}
