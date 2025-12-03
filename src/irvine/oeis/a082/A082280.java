package irvine.oeis.a082;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082280 a(1) = 1, then the smallest number such that there are a(n) composite numbers between a(n) and a(n+1) both excluded.
 * @author Sean A. Irvine
 */
public class A082280 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    final long lim = mA.longValueExact();
    long c = lim;
    if (c == 1) {
      ++c; // special case to handle 2 and 3 only adjacent primes
    }
    for (long k = 0; k < lim; ++k) {
      if (mPrime.isPrime(++c)) {
        ++c;
      }
    }
    mA = Z.valueOf(c + 1);
    return mA;
  }
}
