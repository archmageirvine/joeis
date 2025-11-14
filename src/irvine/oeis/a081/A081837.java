package irvine.oeis.a081;

import irvine.math.ContinuedFractionUtils;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001113;

/**
 * A081837 Let z(n) be e = exp(1.0) = 2.7182.... truncated to n decimal digits after the decimal point; sequence gives maximum element in the continued fraction for z(n).
 * @author Sean A. Irvine
 */
public class A081837 extends Sequence0 {

  private final Sequence mE = new A001113();
  private Z mETrunc = Z.ZERO;
  private Z mA = null;

  @Override
  public Z next() {
    mETrunc = mETrunc.multiply(10).add(mE.next());
    mA = mA == null ? Z.ONE : mA.multiply(10);
    return Functions.MAX.z(ContinuedFractionUtils.continuedFraction(new Q(mETrunc, mA)));
  }
}
