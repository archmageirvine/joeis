package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066081 a(n) = smallest m such that m+2^j and m-2^j are prime for all 0 &lt; j &lt;= n.
 * @author Sean A. Irvine
 */
public class A066081 extends Sequence1 {

  // Only good for a few initial terms

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mM = 5;

  private boolean is(final long m) {
    for (long k = 0, j = 2; k < mN; ++k, j <<= 1) {
      if (!mPrime.isPrime(m - j)) {
        return false;
      }
      if (!mPrime.isPrime(m + j)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (is(mM)) {
        return Z.valueOf(mM);
      }
      mM += 2;
      if (mM < 0) {
        throw new UnsupportedOperationException();
      }
    }
  }
}
