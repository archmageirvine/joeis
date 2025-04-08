package irvine.oeis.a076;

import irvine.math.ContinuedFractionUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076514 a(1)=1, a(n) is the smallest integer &gt; a(n-1) such that the continued fraction for 1/a(1)+1/a(2)+....+1/a(n) contains strictly more elements than the continued fraction for 1/a(1)+1/a(2)+....+1/a(n-1).
 * @author Sean A. Irvine
 */
public class A076514 extends Sequence1 {

  private int mN = 1;
  private Q mA = null;
  private long mM = 1;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Q.ONE;
      return Z.ONE;
    }
    while (true) {
      final Q t = mA.add(new Q(1, ++mM));
      final int size = ContinuedFractionUtils.continuedFraction(t).size();
      if (size > mN) {
        mN = size;
        mA = t;
        return Z.valueOf(mM);
      }
    }
  }
}
