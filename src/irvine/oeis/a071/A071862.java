package irvine.oeis.a071;

import irvine.factor.factor.Jaguar;
import irvine.math.ContinuedFractionUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071862 Number of elements in the continued fraction for Sum_{d|n} 1/d.
 * @author Sean A. Irvine
 */
public class A071862 extends Sequence1 {

  protected long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Q sum = Q.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      sum = sum.add(new Q(Z.ONE, d));
    }
    return Z.valueOf(ContinuedFractionUtils.continuedFraction(sum).size());
  }
}
