package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086404 Square array of numbers T(n,k) = ((1+sqrt(3))*(k+sqrt(3))^n-(1-sqrt(3))*(k-sqrt(3))^n)/(2*sqrt(3)), read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A086404 extends Sequence1 {

  private static final CR SQRT3 = CR.THREE.sqrt();
  private static final CR S0 = SQRT3.add(1);
  private static final CR S1 = CR.ONE.subtract(SQRT3);
  private static final CR S2 = SQRT3.multiply(2);
  private int mN = 0;
  private int mM = -1;

  protected Z t(final int n, final int m) {
    return S0.multiply(SQRT3.add(m).pow(n)).subtract(S1.multiply(CR.valueOf(m).subtract(SQRT3).pow(n))).divide(S2).round();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM);
  }
}

