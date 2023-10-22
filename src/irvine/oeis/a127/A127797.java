package irvine.oeis.a127;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A127797 Nextprime(11^n)-11^n.
 * @author Sean A. Irvine
 */
public class A127797 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(11);
    return mPrime.nextPrime(mA).subtract(mA);
  }
}
