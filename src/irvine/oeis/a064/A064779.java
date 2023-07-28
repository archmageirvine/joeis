package irvine.oeis.a064;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A064779 Primes such that the sum of their digits and the sum of the reciprocals of their digits is also prime.
 * @author Sean A. Irvine
 */
public class A064779 extends A000040 {

  private boolean is(final Z p) {
    if (mPrime.isPrime(ZUtils.digitSum(p))) {
      final int[] counts = ZUtils.digitCounts(p);
      if (counts[0] == 0) {
        Q sum = Q.ZERO;
        for (int k = 1; k < counts.length; ++k) {
          sum = sum.add(new Q(counts[k], k));
        }
        return sum.isInteger() && mPrime.isPrime(sum.toZ());
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (is(p)) {
        return p;
      }
    }
  }
}
