package irvine.oeis.a004;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004412 Expansion of ( Sum_{n = -infinity..infinity} x^(n^2) )^(-11).
 * @author Sean A. Irvine
 */
public class A004412 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(RING.one(), RING.pow(ThetaFunctions.theta3z(++mN), 11, mN), mN);
  }
}

