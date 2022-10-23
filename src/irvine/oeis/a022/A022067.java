package irvine.oeis.a022;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A022067 Theta series of D*_14 lattice.
 * @author Sean A. Irvine
 */
public class A022067 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return RING.pow(ThetaFunctions.theta3z(mN), 14, mN).substitutePower(4, mN).coeff(mN)
      .add(RING.pow(ThetaFunctions.theta2(mN).substitutePower(4).toPolynomial(), 14, mN).coeff(mN));
  }
}
