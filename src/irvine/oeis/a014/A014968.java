package irvine.oeis.a014;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014968.
 * @author Sean A. Irvine
 */
public class A014968 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X2 = Polynomial.create(0, 0, 1);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.coeff(RING.eta(X2, mN), RING.pow(RING.eta(RING.x(), mN), 2, mN), mN).divide2();
  }
}
