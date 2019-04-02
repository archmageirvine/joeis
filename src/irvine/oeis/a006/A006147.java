package irvine.oeis.a006;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006147 Reversion of Ramanujan numbers.
 * @author Sean A. Irvine
 */
public class A006147 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    return RING.reversion(ThetaFunctions.delta24z(++mN + 1).shift(-1), mN).coeff(mN);
  }
}
