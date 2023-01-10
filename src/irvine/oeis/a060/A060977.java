package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060977 The nonprimes n!+2 ... n!+n are the a(n)-th string of n-1 prime-free consecutive terms, the first such one being the string of composite numbers A000230(k)+1 through A001632(k)-1 when n=2k, or through A001632(k)-2 when n=2k-1.
 * @author Sean A. Irvine
 */
public class A060977 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mF = 1;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 20) {
      throw new UnsupportedOperationException(); // n! exceeds long
    }
    if (mN > 1) {
      mF *= mN;
    }
    long cnt = 0;
    long k = 3;
    while (k < mF + 2) {
      final long p = mPrime.nextPrime(k);
      final long d = p - k;
      if (d >= mN) {
        if (p < mF + 2) {
          cnt += d + 1 - mN;
        } else {
          // Special case for the last region running into n!+2, n!+3, ...
          cnt += mF + 2 - k;
        }
      }
      k = p;
    }
    return Z.valueOf(cnt);
  }
}
