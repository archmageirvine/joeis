package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012862 Numerators of coefficients in Taylor series expansion of <code>arccosh(cosec(x)*arctanh(x))</code>.
 * @author Sean A. Irvine
 */
public class A012862 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mN += 2;
    if (mN == 1) {
      return Z.ONE;
    }
    final Polynomial<Q> series = RING.acosh(RING.multiply(RING.xcsc(RING.x(), mN + 1), RING.atanh(RING.x(), mN + 2), mN + 2).shift(-1), mN);
    //System.out.println("n=" + mN + " -> " + series);
    return select(series.coeff(mN));
  }
}
