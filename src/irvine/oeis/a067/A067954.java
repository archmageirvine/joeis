package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A067954 Primes related to the nondecreasing subsequence of A007605 (sums of digits of primes).
 * @author Sean A. Irvine
 */
public class A067954 extends A000040 {

  private long mBest = 0;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long t = ZUtils.digitSum(p);
      if (t >= mBest) {
        mBest = t;
        return p;
      }
    }
  }
}
