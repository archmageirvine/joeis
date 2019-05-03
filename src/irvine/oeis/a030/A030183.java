package irvine.oeis.a030;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030183 McKay-Thompson series of class <code>7A</code> for the Monster group with <code>a(0) = 10</code>.
 * @author Sean A. Irvine
 */
public class A030183 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> SEVEN = Polynomial.create(0, 7);
  private static final Polynomial<Z> X7 = RING.monomial(Z.ONE, 7);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Polynomial<Z> h = RING.pow(RING.series(RING.eta(RING.x(), mN), RING.eta(X7, mN), mN), 4, mN);
    return RING.coeff(RING.pow(RING.add(h, SEVEN), 2, mN), h, mN);
  }
}
