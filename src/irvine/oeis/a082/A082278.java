package irvine.oeis.a082;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082278 a(1)=1; for n &gt;= 1, a(n+1) is minimal such that there are a(n) primes strictly between a(n) and a(n+1).
 * @author Sean A. Irvine
 */
public class A082278 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    final long lim = mA.longValueExact();
    long p = lim;
    for (long k = 0; k < lim; ++k) {
      p = mPrime.nextPrime(p);
    }
    mA = Z.valueOf(p + 1);
    return mA;
  }
}
