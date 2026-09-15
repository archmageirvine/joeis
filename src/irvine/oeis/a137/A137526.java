package irvine.oeis.a137;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A137526 A triangular sequence of coefficients based on an expansion of a Enneper like Sheffer expansion function: g(t) = t; f(t) = t; p(x,t) = Exp[x*(t)]*(1 - f(t)2).
 * @author Sean A. Irvine
 */
public class A137526 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z(mM)).multiply((mN == mM ? 1 : 0) - ((mN == mM + 2) ? 1 : 0));
  }
}
