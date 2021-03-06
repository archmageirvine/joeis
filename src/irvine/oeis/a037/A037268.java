package irvine.oeis.a037;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A037268 Sum of reciprocals of digits = 1.
 * @author Sean A. Irvine
 */
public class A037268 implements Sequence {

  private boolean mDone = false;
  private long mN = 0;

  @Override
  public Z next() {
    if (mDone) {
      return null;
    }
    while (true) {
      if (++mN == 999999999) {
        mDone = true; // no more terms after this one
      }
      final int[] cnts = ZUtils.digitCounts(mN);
      if (cnts[0] == 0) {
        Q s = Q.ZERO;
        for (int k = 1; k < cnts.length; ++k) {
          s = s.add(new Q(cnts[k], k));
        }
        if (Q.ONE.equals(s)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

