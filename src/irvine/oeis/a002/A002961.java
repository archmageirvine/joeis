package irvine.oeis.a002;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002961 Numbers k such that k and k+1 have same sum of divisors.
 * @author Sean A. Irvine
 */
public class A002961 extends Sequence1 {

  private long mN = 13;
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z sum = Functions.SIGMA.z(++mN);
      final boolean res = sum.equals(mPrev);
      mPrev = sum;
      if (res) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
