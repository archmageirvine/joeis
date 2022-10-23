package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A038625 a(n) is smallest number m such that m = n*pi(m), where pi(k) = number of primes &lt;= k (A000720).
 * @author Sean A. Irvine
 */
public class A038625 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mN = 1;
  private long mPi = 0;
  private long mM = 1;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (mM == mN * mPi) {
        return Z.valueOf(mM);
      }
      if (mPrime.isPrime(++mM)) {
        ++mPi;
      }
    }
  }
}
