package irvine.oeis.a007;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007248 McKay-Thompson series of class <code>4C</code> for the Monster group.
 * @author Sean A. Irvine
 */
public class A007248 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X4 = Polynomial.create(0, 0, 0, 0, 1);
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return RING.pow(RING.series(RING.eta(RING.x(), mN), RING.eta(X4, mN), mN), 8, mN).coeff(mN);
  }
}
