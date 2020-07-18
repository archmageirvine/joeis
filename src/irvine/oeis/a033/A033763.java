package irvine.oeis.a033;

import irvine.math.group.IntegerField;
import irvine.math.group.QPolynomialRingField;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033763 Product <code>t2(q^d); d | 4</code>, where <code>t2 = theta2(q)/(2*q^(1/4))</code>.
 * @author Sean A. Irvine
 */
public class A033763 implements Sequence {

  private final QPolynomialRingField<Z> RING = new QPolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -2;

  protected int base() {
    return 4;
  }

  @Override
  public Z next() {
    mN += 2;
    if (mN == 0) {
      return Z.ONE;
    }
    QPolynomial<Z> prod = RING.one();
    for (int k = 1; k <= base(); ++k) {
      if (base() % k == 0) {
        prod = RING.multiply(prod, RING.divide(ThetaFunctions.theta2(4 * mN).substitutePower(k).shift(new Q(-k, 4)), Z.TWO), mN);
      }
    }
    return prod.coeff(mN);
  }
}
