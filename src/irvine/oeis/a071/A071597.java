package irvine.oeis.a071;

import irvine.math.ContinuedFractionUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071576.
 * @author Sean A. Irvine
 */
public class A071597 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return ContinuedFractionUtils.continuedFractionSum(new Q(++mN + 1, mN).pow(mN));
  }
}

