package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.factor.prime.Prime;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013599 <code>nextprime(5^n)-5^n</code>.
 * @author Sean A. Irvine
 */
public class A013599 implements Sequence {

  private Prime mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(5);
    return mPrime.nextPrime(mA).subtract(mA);
  }
}
