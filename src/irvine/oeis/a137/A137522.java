package irvine.oeis.a137;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A137522 A triangular sequence from an expansion of coefficients of the function: p(x,t)=Exp(x*g*(t))*(1-f(t)^2);f(t)=1/Sqrt[1 - 14*t^4 + t^8];g(t)=t. (Based on the Weierstrass functions of Schwarz's minimal surface which is identified with a cube.).
 * @author Sean A. Irvine
 */
public class A137522 extends Sequence0 {

  private static final CR C1 = CR.THREE.sqrt().multiply(4);
  private static final CR C2 = C1.multiply(2);
  private static final CR C3 = CR.SEVEN.add(C1);
  private static final CR C4 = CR.SEVEN.subtract(C1);
  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > Math.max(0, mN - 4)) {
      if (++mN == 0) {
        return Z.ZERO;
      }
      mM = 0;
    }
    if (((mN - mM) & 3) == 0) {
      final long m = (mN - mM) / 4;
      final Z t = C3.pow(m + 1).subtract(C4.pow(m + 1)).divide(C2).round();
      return Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z(mM)).multiply(t).negate();
    }
    return Z.ZERO;
  }
}
