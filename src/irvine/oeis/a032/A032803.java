package irvine.oeis.a032;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A032803 Expansion of Sum_{i&gt;=0} q^i*theta_3^i.
 * @author Sean A. Irvine
 */
public class A032803 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(RING.one(), RING.subtract(RING.one(), ThetaFunctions.theta3z(++mN).shift(1)), mN);
  }
}
