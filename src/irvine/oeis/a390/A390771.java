package irvine.oeis.a390;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A390771 allocated for James S. DeArmon.
 * @author Sean A. Irvine
 */
public class A390771 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mN = 2;

  @Override
  public Z next() {
    mN += 2;
    Z min = null;
    for (long p = 2; 2 * p <= mN; p = mPrime.nextPrime(p)) {
      final long q = mN - p;
      if (mPrime.isPrime(q)) {
        final Z pq = new Z(Long.toString(p) + q);
        if (min == null || pq.compareTo(min) < 0) {
          min = pq;
        }
      }
    }
    return min;
  }
}
