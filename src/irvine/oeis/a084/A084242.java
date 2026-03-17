package irvine.oeis.a084;

import irvine.math.ContinuedFractionUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084242 Least k, 1 &lt;= k &lt;= n, such that the number of elements of the continued fraction for n/k is maximum.
 * @author Sean A. Irvine
 */
public class A084242 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    int max = 0;
    int maxK = 0;
    for (int k = 1; k <= mN; ++k) {
      final int len = ContinuedFractionUtils.continuedFraction(new Q(mN, k)).size();
      if (len > max) {
        max = len;
        maxK = k;
      }
    }
    return Z.valueOf(maxK);
  }
}
