package irvine.oeis.a014;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014972 Expansion of (theta_3(q) / theta_4(q) )^4 in powers of q; also of 1 / (1 - lambda(z)).
 * @author Sean A. Irvine
 */
public class A014972 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.pow(RING.series(ThetaFunctions.theta3z(mN), ThetaFunctions.theta4z(mN), mN), 4, mN).coeff(mN);
  }
}
