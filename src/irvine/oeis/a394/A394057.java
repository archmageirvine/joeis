package irvine.oeis.a394;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A394057 allocated for Dmitry Kamenetsky.
 * @author Sean A. Irvine
 */
public class A394057 extends Sequence1 {

  private static final long HEURISTIC = 100;
  private long mN = 0;

  private Q mean(final Z n) {
    final int[] cnts = ZUtils.digitCounts(n);
    long sum = 0;
    long den = 0;
    for (int k = 0; k < cnts.length; ++k) {
      den += cnts[k];
      sum += k * (long) cnts[k];
    }
    return new Q(sum, den);
  }

  @Override
  public Z next() {
    ++mN;
    Q best = Q.ZERO;
    long bestK = 0;
    long k = 1;
    Z pn = Z.valueOf(mN);
    while (++k <= (bestK + 1) * HEURISTIC) {
      pn = pn.multiply(mN);
      final Q mean = mean(pn);
      if (mean.compareTo(best) > 0) {
        best = mean;
        bestK = k;
      }
    }
    return Z.valueOf(bestK);
  }
}
