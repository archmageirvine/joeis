package irvine.oeis.a022;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A022083 Theta series of D*_30 lattice.
 * @author Sean A. Irvine
 */
public class A022083 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return RING.pow(ThetaFunctions.theta3z(mN / 4), 30, mN / 4).substitutePower(4, mN).coeff(mN)
      .add(RING.pow(ThetaFunctions.theta2(mN / 4).substitutePower(4).toPolynomial(), 30, mN).coeff(mN));
  }
}
