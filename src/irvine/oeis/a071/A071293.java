package irvine.oeis.a071;

import irvine.math.ContinuedFractionUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071013.
 * @author Sean A. Irvine
 */
public class A071293 extends Sequence0 {

  private Q mSum = Q.ONE;
  private int mN = -1;
  private long mM = 1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    while (true) {
      final Q t = mSum.add(new Q(1, mM));
      if (ContinuedFractionUtils.continuedFraction(t).size() == 1 << mN) {
        mSum = t;
        return Z.valueOf(mM);
      }
      ++mM;
    }
  }
}
