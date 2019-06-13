package irvine.oeis.a023;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023917 Theta series of <code>A*_5</code> lattice.
 * @author Sean A. Irvine
 */
public class A023917 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    final Polynomial<Z> theta3 = ThetaFunctions.theta3z(++mN);
    final Polynomial<Z> theta33 = theta3.substitutePower(3, mN);
    final Z a = RING.pow(theta3, 5, mN).coeff(mN).multiply(-3);
    final Z b = RING.multiply(RING.pow(theta3, 3, mN), RING.pow(theta33, 2, mN), mN).coeff(mN).multiply(5);
    final Z c = RING.multiply(theta3, RING.pow(theta33, 4), mN).coeff(mN).multiply(15);
    final Z d = RING.coeff(RING.pow(theta33, 6, mN), theta3, mN).multiply(15);
    return a.add(b).add(c).add(d).divide(32);
  }
}
