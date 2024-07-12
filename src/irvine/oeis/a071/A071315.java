package irvine.oeis.a071;

import irvine.math.ContinuedFractionUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071315 Number of terms in the continued fraction of frac((3/2)^n).
 * @author Sean A. Irvine
 */
public class A071315 extends Sequence1 {

  private static final Q C = new Q(3, 2);
  private Q mT = Q.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(C);
    return Z.valueOf(ContinuedFractionUtils.continuedFraction(mT).size() - 1);
  }
}
