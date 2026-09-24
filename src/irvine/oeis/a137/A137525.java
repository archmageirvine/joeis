package irvine.oeis.a137;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A137525 A triangular sequence of coefficients based on an expansion of a Catenoid like Sheffer expansion function: g(t) = t; f(t) = -1/t; p(x,t) = Exp[x*(t)]*(1 - f(t)^2).
 * @author Sean A. Irvine
 */
public class A137525 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN + 2) {
      ++mN;
      mM = 0;
    }
    if (mM == mN) {
      return Functions.FACTORIAL.z(mN + 2);
    }
    if (mM == mN + 2) {
      return Functions.FACTORIAL.z(mN).negate();
    }
    return Z.ZERO;
  }
}
