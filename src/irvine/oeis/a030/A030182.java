package irvine.oeis.a030;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030182 McKay-Thompson series of class 3B for the Monster group with a(0) = -12.
 * @author Sean A. Irvine
 */
public class A030182 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> C = Polynomial.create(0, 0, 0, 1);
  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.pow(RING.series(RING.eta(RING.x(), mN), RING.eta(C, mN), mN), 12, mN).coeff(mN);
  }
}
