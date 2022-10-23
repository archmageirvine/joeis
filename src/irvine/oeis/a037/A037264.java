package irvine.oeis.a037;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A037264 Numbers whose sum of reciprocals of digits is the reciprocal of an integer.
 * @author Sean A. Irvine
 */
public class A037264 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final int[] cnts = ZUtils.digitCounts(mN);
      if (cnts[0] == 0) {
        Q s = Q.ZERO;
        for (int k = 1; k < cnts.length; ++k) {
          s = s.add(new Q(cnts[k], k));
        }
        if (s.reciprocal().isInteger()) {
          return mN;
        }
      }
    }
  }
}

