package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062831 Number of ways n can be expressed as the sum of a nonzero square and 1 or a prime.
 * @author Sean A. Irvine
 */
public class A062831 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long m = 1, r; (r = mN - m * m) > 0; ++m) {
      if (r == 1 || mPrime.isPrime(r)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
