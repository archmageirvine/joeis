package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066325 Coefficients of unitary Hermite polynomials He_n(x).
 * @author Sean A. Irvine
 */
public class A066325 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return ((mN - mM) & 1) == 1
      ? Z.ZERO
      : Z.NEG_ONE.pow((mM - mN) / 2).multiply(Functions.FACTORIAL.z(mN)).divide(Functions.FACTORIAL.z(mM)).divide(Functions.FACTORIAL.z((mN - mM) / 2)).shiftRight((mN - mM) / 2);
  }
}
