package irvine.oeis.a080;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080608
 * @author Sean A. Irvine
 */
public class A080612 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  private boolean is(final long n) {
    long sumA = 0;
    long sumB = 0;
    long p = 2;
    for (long k = 1; k <= n; ++k) {
      final long q = mPrime.nextPrime(p);
      final long r = mPrime.nextPrime(q);
      sumA += r - q;
      sumB += q - p;
      p = r;
    }
    final long v = mPrime.prevPrime(p);
    return Z.valueOf(sumA).multiply(v).compareTo(Z.valueOf(sumB).multiply(p)) >= 0;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
