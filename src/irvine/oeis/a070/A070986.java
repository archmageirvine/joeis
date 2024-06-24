package irvine.oeis.a070;

import irvine.math.ContinuedFractionUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070964.
 * @author Sean A. Irvine
 */
public class A070986 extends Sequence1 {

  private Q mSum = Q.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    mSum = mSum.add(new Q(Z.ONE, Z.valueOf(++mN).pow(3)));
    return Z.valueOf(ContinuedFractionUtils.continuedFraction(mSum).size());
  }
}
