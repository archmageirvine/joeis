package irvine.oeis.a082;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082281 a(1) = 1, a(2) = 2; then a(n) = smallest number such that there are a(n-1) composite numbers between a(n) and a(n+1) exclusive.
 * @author Sean A. Irvine
 */
public class A082281 extends Sequence1 {

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
    long c = mB.longValueExact();
    for (long k = 0; k < lim; ++k) {
      if (mPrime.isPrime(++c)) {
        ++c;
      }
    }
    mA = mB;
    mB = Z.valueOf(c + 1);
    return mB;
  }
}
