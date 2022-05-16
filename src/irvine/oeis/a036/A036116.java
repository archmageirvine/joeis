package irvine.oeis.a036;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036116 Numbers n such that the number of distinct primes dividing n is a square.
 * @author Sean A. Irvine
 */
public class A036116 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long omega = Jaguar.factor(++mN).omega();
      final long s = LongUtils.sqrt(omega);
      if (s * s == omega) {
        return Z.valueOf(mN);
      }
    }
  }
}
