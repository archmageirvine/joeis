package irvine.oeis.a051;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A051352 a(0) = 0; for n&gt;0, a(n) = a(n-1) + n if n not prime else a(n-1) - n.
 * @author Sean A. Irvine
 */
public class A051352 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mA = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    mA = mA.signedAdd(!mPrime.isPrime(++mN), Z.valueOf(mN));
    return mA;
  }
}
