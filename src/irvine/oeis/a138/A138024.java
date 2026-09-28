package irvine.oeis.a138;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A138024 A triangular sequence of coefficients of an expansion of a Mach wave as a traveling wave in a medium: (vt')^2 = vp*vg = c^2 - (gamma-1)/(gamma+1)*vt^2; Substituting: vt -&gt; exp(t*x); gamma-&gt;t; c-&gt;1; p(x,t) = 1 - exp(2*x*t)*(t - 1)/(1 + t).
 * @author Sean A. Irvine
 */
public class A138024 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    if (mN == 0) {
      return Z.ONE;
    }
    if (mM == mN) {
      return Z.ONE.shiftLeft(mN - 1);
    }
    return Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z(mM)).shiftLeft(mM).multiply(Z.NEG_ONE.pow(mN - mM));
  }
}
