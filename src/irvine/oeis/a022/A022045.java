package irvine.oeis.a022;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022045 Theta series of D_14 lattice.
 * @author Sean A. Irvine
 */
public class A022045 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return RING.pow(ThetaFunctions.theta3z(mN), 14, mN).coeff(mN).add(RING.pow(ThetaFunctions.theta4z(mN), 14, mN).coeff(mN)).divide2();
  }
}
