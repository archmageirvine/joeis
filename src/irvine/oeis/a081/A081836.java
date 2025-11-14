package irvine.oeis.a081;

import irvine.math.ContinuedFractionUtils;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001622;

/**
 * A081836 Let z(n) be the golden ratio (phi) truncated to n decimal digits; sequence gives maximum element in the continued fraction for z(n).
 * @author Sean A. Irvine
 */
public class A081836 extends Sequence0 {

  private final Sequence mPhi = new A001622();
  private Z mPhiTrunc = Z.ZERO;
  private Z mA = null;

  @Override
  public Z next() {
    mPhiTrunc = mPhiTrunc.multiply(10).add(mPhi.next());
    mA = mA == null ? Z.ONE : mA.multiply(10);
    return Functions.MAX.z(ContinuedFractionUtils.continuedFraction(new Q(mPhiTrunc, mA)));
  }
}
