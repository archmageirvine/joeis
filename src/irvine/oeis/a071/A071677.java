package irvine.oeis.a071;

import irvine.math.ContinuedFractionUtils;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071677 Numbers k such that the number of divisors of k equals the maximum number of elements among the continued fractions for k/1, k/2, k/3, k/4, ..., k/k.
 * @author Sean A. Irvine
 */
public class A071677 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final int s = Functions.SIGMA0.i(++mN);
      int max = 0;
      for (long k = 1; k <= mN; ++k) {
        max = Math.max(max, ContinuedFractionUtils.continuedFraction(new Q(mN, k), s + 1).size());
        if (max > s) {
          break;
        }
      }
      if (max == s) {
        return Z.valueOf(mN);
      }
    }
  }
}
