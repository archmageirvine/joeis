package irvine.oeis.a022;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A022047 Theta series of D_16 lattice.
 * @author Sean A. Irvine
 */
public class A022047 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return RING.pow(ThetaFunctions.theta3z(mN), 16, mN).coeff(mN).add(RING.pow(ThetaFunctions.theta4z(mN), 16, mN).coeff(mN)).divide2();
  }
}
