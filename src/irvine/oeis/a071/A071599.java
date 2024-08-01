package irvine.oeis.a071;

import irvine.math.ContinuedFractionUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071599 Product of elements in the simple continued fraction for (1+1/n)^n.
 * @author Sean A. Irvine
 */
public class A071599 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return ContinuedFractionUtils.continuedFractionProduct(new Q(++mN + 1, mN).pow(mN));
  }
}

