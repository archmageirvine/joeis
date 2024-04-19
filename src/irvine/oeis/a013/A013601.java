package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.factor.prime.Prime;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013601 a(n) = nextprime(7^n)-7^n.
 * @author Sean A. Irvine
 */
public class A013601 extends Sequence0 {

  private final Prime mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(7);
    return mPrime.nextPrime(mA).subtract(mA);
  }
}
