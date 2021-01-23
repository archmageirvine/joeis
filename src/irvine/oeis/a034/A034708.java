package irvine.oeis.a034;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A034708 Numbers for which the sum of reciprocals of digits is an integer.
 * @author Sean A. Irvine
 */
public class A034708 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final int[] counts = ZUtils.digitCounts(mN);
      if (counts[0] == 0) {
        Q sum = Q.ZERO;
        for (int k = 1; k < counts.length; ++k) {
          sum = sum.add(new Q(counts[k], k));
        }
        if (sum.isInteger()) {
          return mN;
        }
      }
    }
  }
}

