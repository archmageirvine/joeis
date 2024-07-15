package irvine.oeis.a071;

import java.util.List;

import irvine.math.ContinuedFractionUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071291 Second term of the continued fraction expansion of (3/2)^n; or 0 if no term is present.
 * @author Sean A. Irvine
 */
public class A071353 extends Sequence1 {

  private static final Q C = new Q(3, 2);
  private Q mT = Q.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(C);
    final List<Z> cf = ContinuedFractionUtils.continuedFraction(mT, 2);
    return cf.size() < 2 ? Z.ZERO : cf.get(1);
  }
}
