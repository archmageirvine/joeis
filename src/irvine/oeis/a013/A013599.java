package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.factor.prime.Prime;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013599 a(n) = nextprime(5^n) - 5^n.
 * @author Sean A. Irvine
 */
public class A013599 extends Sequence0 {

  private final Prime mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(5);
    return mPrime.nextPrime(mA).subtract(mA);
  }
}
