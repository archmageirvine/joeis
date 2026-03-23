package irvine.oeis.a394;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A394058 Conjectured least integer k&gt;1 such that n^k has the smallest average of digits, or -1 if no such k exists.
 * @author Sean A. Irvine
 */
public class A394058 extends Sequence1 {

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
    if (++mN == 1) {
      return Z.TWO;
    }
    long m = mN;
    while (m % 10 == 0) {
      m /= 10;
    }
    if (m == 1) {
      return Z.NEG_ONE; // n = 10^j
    }
    Q best = Q.TEN;
    long bestK = 0;
    long k = 1;
    Z pn = Z.valueOf(mN);
    while (++k <= (bestK + 1) * HEURISTIC) {
      pn = pn.multiply(mN);
      final Q mean = mean(pn);
      if (mean.compareTo(best) < 0) {
        best = mean;
        bestK = k;
      }
    }
    return Z.valueOf(bestK);
  }
}
