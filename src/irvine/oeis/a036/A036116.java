package irvine.oeis.a036;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036116 Numbers n such that the number of distinct primes dividing n is a square.
 * @author Sean A. Irvine
 */
public class A036116 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long omega = Functions.OMEGA.i(++mN);
      final long s = Functions.SQRT.l(omega);
      if (s * s == omega) {
        return Z.valueOf(mN);
      }
    }
  }
}
