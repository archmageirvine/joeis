package irvine.oeis.a070;

import irvine.math.ContinuedFractionUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A070154 Number of terms in the simple continued fraction expansion of Sum_{k=0..n}(-1)^k/(2k+1), the Leibniz-Gregory series for Pi/4.
 * @author Sean A. Irvine
 */
public class A070154 extends Sequence0 {

  private long mN = -1;
  private Q mSum = Q.ZERO;

  @Override
  public Z next() {
    mSum = mSum.signedAdd((++mN & 1) == 0, new Q(1, 2 * mN + 1));
    return Z.valueOf(ContinuedFractionUtils.continuedFraction(mSum).size());
  }
}
