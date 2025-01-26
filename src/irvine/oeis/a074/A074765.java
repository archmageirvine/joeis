package irvine.oeis.a074;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074765 Number of composites that are a concatenation nk of n and k for values of k from 1 to n.
 * @author Sean A. Irvine
 */
public class A074765 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long lim = 10;
    long cnt = 0;
    for (long k = 1; k <= mN; ++k) {
      if (k > lim) {
        lim *= 10;
      }
      if (!mPrime.isPrime(mN * lim + k)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
