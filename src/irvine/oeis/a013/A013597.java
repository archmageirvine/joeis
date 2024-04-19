package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.factor.prime.Prime;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013597 a(n) = nextprime(2^n) - 2^n.
 * @author Sean A. Irvine
 */
public class A013597 extends Sequence0 {

  private final Prime mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply2();
    return mPrime.nextPrime(mA).subtract(mA);
  }
}
