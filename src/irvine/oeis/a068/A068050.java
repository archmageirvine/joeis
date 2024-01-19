package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068050 Number of values of k, 1&lt;=k&lt;=n, for which floor(n/k) is prime.
 * @author Sean A. Irvine
 */
public class A068050 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 1; k < mN; ++k) {
      if (mPrime.isPrime(mN / k)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
