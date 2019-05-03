package irvine.oeis.a106;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A106248 McKay-Thompson series of class <code>5B</code> for the Monster group with <code>a(0) = -6</code>.
 * @author Sean A. Irvine
 */
public class A106248 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X5 = Polynomial.create(0, 0, 0, 0, 0, 1);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.pow(RING.series(RING.eta(RING.x(), mN), RING.eta(X5, mN), mN), 6, mN).coeff(mN);
  }
}
