package irvine.oeis.a071;

import irvine.math.ContinuedFractionUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071293 a(0)=1, a(n) is the smallest integer &gt; a(n-1) such that the continued fraction for 1/a(0)+1/a(1)+1/a(2)+...+1/a(n) contains exactly 2^n elements.
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
