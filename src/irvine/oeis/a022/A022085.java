package irvine.oeis.a022;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022085 Theta series of <code>D*_32</code> lattice.
 * @author Sean A. Irvine
 */
public class A022085 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -4;

  @Override
  public Z next() {
    mN += 4;
    return RING.pow(ThetaFunctions.theta3z(mN / 4), 32, mN / 4).substitutePower(4, mN).coeff(mN)
      .add(RING.pow(ThetaFunctions.theta2(mN / 4).substitutePower(4).toPolynomial(), 32, mN).coeff(mN));
  }
}
