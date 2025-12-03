package irvine.oeis.a082;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082279 a(1)=1, a(2)=2 and a(n+1) is minimal such that there are a(n-1) primes strictly between a(n) and a(n+1).
 * @author Sean A. Irvine
 */
public class A082279 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.TWO;
      return Z.TWO;
    }
    final long lim = mA.longValueExact();
    long p = mB.longValueExact();
    for (long k = 0; k < lim; ++k) {
      p = mPrime.nextPrime(p);
    }
    mA = mB;
    mB = Z.valueOf(p + 1);
    return mB;
  }
}
