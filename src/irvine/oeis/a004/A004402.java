package irvine.oeis.a004;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004402 Expansion of 1 / Sum_{n=-oo..oo} x^(n^2).
 * @author Sean A. Irvine
 */
public class A004402 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(RING.one(), ThetaFunctions.theta3z(++mN), mN);
  }
}

