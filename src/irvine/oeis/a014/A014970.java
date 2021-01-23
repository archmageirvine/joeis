package irvine.oeis.a014;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014970 Expansion of (theta_3 / theta_4)^3.
 * @author Sean A. Irvine
 */
public class A014970 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.pow(RING.series(ThetaFunctions.theta3z(mN), ThetaFunctions.theta4z(mN), mN), 3, mN).coeff(mN);
  }
}
