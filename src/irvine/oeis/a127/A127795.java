package irvine.oeis.a127;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A127795 Nextprime(8^n)-8^n.
 * @author Sean A. Irvine
 */
public class A127795 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(8);
    return mPrime.nextPrime(mA).subtract(mA);
  }
}
