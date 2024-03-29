package irvine.oeis.a127;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A127796 a(n) = nextprime(9^n) - 9^n.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A127796 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(9);
    return mPrime.nextPrime(mA).subtract(mA);
  }
}
