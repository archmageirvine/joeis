package irvine.oeis.a071;

import irvine.math.ContinuedFractionUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071012 a(1)=1, a(n) is the smallest number &gt;= a(n-1) such that the simple continued fraction for S(n) = 1/a(1) + 1/a(2) + ... + 1/a(n) contains exactly n elements.
 * @author Sean A. Irvine
 */
public class A071012 extends Sequence1 {

  private Q mSum = Q.ZERO;
  private int mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      final Q t = mSum.add(new Q(1, mM));
      if (ContinuedFractionUtils.continuedFraction(t).size() == mN) {
        mSum = t;
        return Z.valueOf(mM);
      }
      ++mM;
    }
  }
}
