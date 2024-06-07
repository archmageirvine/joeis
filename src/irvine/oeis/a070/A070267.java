package irvine.oeis.a070;

import irvine.math.ContinuedFractionUtils;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070267 Maximum element in the simple continued fraction expansion of e(n) = 1+1/2!+1/3!+...+1/n!.
 * @author Sean A. Irvine
 */
public class A070267 extends Sequence1 {

  private long mN = 0;
  private Z mF = Z.ONE;
  private Q mSum = Q.ZERO;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    mSum = mSum.add(new Q(Z.ONE, mF));
    return Functions.MAX.z(ContinuedFractionUtils.continuedFraction(mSum));
  }
}
