package irvine.oeis.a004;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004419 Expansion of (Sum_{n=-inf..inf} x^(n^2))^(-18).
 * @author Sean A. Irvine
 */
public class A004419 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(RING.one(), RING.pow(ThetaFunctions.theta3z(++mN), 18, mN), mN);
  }
}

