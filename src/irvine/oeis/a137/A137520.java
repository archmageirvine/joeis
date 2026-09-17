package irvine.oeis.a137;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A137520 A triangular sequence from an expansion of coefficients of the function: p(x,t)=Exp(x*g*(t))*(1-f(t)^2);f(t)=4/(t^4-1);g(t)=t. (based on the Weierstrass functions of Scherk's minimal surface).
 * @author Sean A. Irvine
 */
public class A137520 extends Sequence0 {

  private static final Z NEG5 = Z.valueOf(-5);
  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    if (mM == mN) {
      return NEG5;
    }
    if (((mN - mM) & 3) == 0) {
      return Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z(mM)).multiply(mN + 4 - mM).multiply(4).divide(3).negate();
    }
    return Z.ZERO;
  }
}
