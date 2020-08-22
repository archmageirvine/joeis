package irvine.oeis.a022;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022043 Theta series of D_12 lattice.
 * @author Sean A. Irvine
 */
public class A022043 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return RING.pow(ThetaFunctions.theta3z(mN), 12, mN).coeff(mN).add(RING.pow(ThetaFunctions.theta4z(mN), 12, mN).coeff(mN)).divide2();
  }
}
