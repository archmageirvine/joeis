package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.factor.prime.Prime;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013598.
 * @author Sean A. Irvine
 */
public class A013598 implements Sequence {

  private Prime mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(3);
    return mPrime.nextPrime(mA).subtract(mA);
  }
}
