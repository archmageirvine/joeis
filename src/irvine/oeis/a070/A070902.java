package irvine.oeis.a070;

import irvine.math.ContinuedFractionUtils;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070899.
 * @author Sean A. Irvine
 */
public class A070902 extends Sequence1 {

  private Q mSum = null;
  private Z mM = Z.ONE;
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mSum == null) {
      mSum = Q.ONE;
      return Z.ONE;
    }
    final Z n2 = mN.square();
    while (true) {
      mM = mM.add(1);
      final Q t = mSum.add(new Q(Z.ONE, mM));
      final Z max = Functions.MAX.z(ContinuedFractionUtils.continuedFraction(t));
      if (max.equals(n2)) {
        mSum = t;
        return mM;
      }
    }
  }
}
