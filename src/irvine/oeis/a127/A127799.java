package irvine.oeis.a127;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A127799 Nextprime(13^n)-13^n.
 * @author Sean A. Irvine
 */
public class A127799 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(13);
    return mPrime.nextPrime(mA).subtract(mA);
  }
}
