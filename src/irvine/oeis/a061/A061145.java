package irvine.oeis.a061;

import irvine.math.ContinuedFractionUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061145 Sum of continued fraction terms in Sum_{k=1..n}(1/k^2).
 * @author Sean A. Irvine
 */
public class A061145 extends Sequence1 {

  private Q mSum = Q.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    mSum = mSum.add(new Q(1, ++mN * mN));
    return ContinuedFractionUtils.continuedFractionSum(mSum);
  }
}
