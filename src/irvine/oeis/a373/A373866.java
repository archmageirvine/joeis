package irvine.oeis.a373;

import irvine.math.ContinuedFractionUtils;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000796;

/**
 * A373866 a(n) = maximum element in the continued fraction for Pi truncated to n decimal digits after the decimal point.
 * @author Sean A. Irvine
 */
public class A373866 extends Sequence0 {

  private final Sequence mPi = new A000796();
  private Z mPiTrunc = Z.ZERO;
  private Z mA = null;

  @Override
  public Z next() {
    mPiTrunc = mPiTrunc.multiply(10).add(mPi.next());
    mA = mA == null ? Z.ONE : mA.multiply(10);
    return Functions.MAX.z(ContinuedFractionUtils.continuedFraction(new Q(mPiTrunc, mA)));
  }
}
