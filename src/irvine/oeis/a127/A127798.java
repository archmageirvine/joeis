package irvine.oeis.a127;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A127798 Nextprime(12^n)-12^n.
 * @author Sean A. Irvine
 */
public class A127798 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(12);
    return mPrime.nextPrime(mA).subtract(mA);
  }
}
