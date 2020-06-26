package irvine.oeis.a032;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032803 Expansion of <code>sum( q^i*theta_3^i, i=0..inf)</code>.
 * @author Sean A. Irvine
 */
public class A032803 implements Sequence {

  private final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(RING.one(), RING.subtract(RING.one(), ThetaFunctions.theta3z(++mN).shift(1)), mN);
  }
}
