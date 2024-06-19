package irvine.oeis.a070;

import irvine.math.ContinuedFractionUtils;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070899 a(1)=1, a(n) is the smallest integer &gt; a(n-1) such that the largest element in the simple continued fraction for S(n)=1/a(1)+1/a(2)+...+1/a(n) equals 3n.
 * @author Sean A. Irvine
 */
public class A070899 extends Sequence1 {

  private Q mSum = null;
  private Z mM = Z.ONE;
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(3);
    if (mSum == null) {
      mSum = Q.ONE;
      return Z.ONE;
    }
    while (true) {
      mM = mM.add(1);
      final Q t = mSum.add(new Q(Z.ONE, mM));
      final Z max = Functions.MAX.z(ContinuedFractionUtils.continuedFraction(t));
      if (max.equals(mN)) {
        mSum = t;
        return mM;
      }
    }
  }
}
