package irvine.oeis.a082;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082650 Number of primes &lt; n of form 1+k*spf(n), where spf(n) is the smallest prime factor of n (A020639).
 * @author Sean A. Irvine
 */
public class A082650 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    final long lpf = Functions.LPF.l(++mN);
    long cnt = 0;
    for (long p = mPrime.nextPrime(lpf); p < mN; p = mPrime.nextPrime(p)) {
      if ((p - 1) % lpf == 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
