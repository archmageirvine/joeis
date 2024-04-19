package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.factor.prime.Prime;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013600 a(n) = nextprime(6^n)-6^n.
 * @author Sean A. Irvine
 */
public class A013600 extends Sequence0 {

  private final Prime mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(6);
    return mPrime.nextPrime(mA).subtract(mA);
  }
}
