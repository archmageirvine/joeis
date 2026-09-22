package irvine.oeis.a137;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A137523 A triangular sequence from an expansion of coefficients of the function: p(x,t)=Exp(x*g*(t))*(1-f(t)^2);f(t)=1/Sqrt[1 - 2*t^2 + t^4];g(t)=t. (Based on the Weierstrass functions of Jenkins-Serrin minimal surface.).
 * @author Sean A. Irvine
 */
public class A137523 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > Math.max(0, mN - 2)) {
      if (++mN == 0) {
        return Z.ZERO;
      }
      mM = 0;
    }
    if (((mN - mM) & 1) == 0) {
      return Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z(mM)).multiply(mN - mM + 2).divide2().negate();
    }
    return Z.ZERO;
  }
}
