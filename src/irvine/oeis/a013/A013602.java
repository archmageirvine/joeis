package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.factor.prime.Prime;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013602 nextprime(4^n)-4^n.
 * @author Sean A. Irvine
 */
public class A013602 implements Sequence {

  private Prime mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(4);
    return mPrime.nextPrime(mA).subtract(mA);
  }
}
