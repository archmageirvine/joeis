package irvine.oeis.a032;

import irvine.math.group.QPolynomialRing;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032803.
 * @author Sean A. Irvine
 */
public class A032803 implements Sequence {

  private final QPolynomialRing<Z> RING = new QPolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    QPolynomial<Z> sum = QPolynomial.create(0);
    final QPolynomial<Z> theta3 = ThetaFunctions.theta3(mN);
    QPolynomial<Z> t = RING.one();
    for (int k = 0; k <= mN; ++k, t = RING.multiply(t, theta3, mN)) {
      sum = RING.add(sum, t.shift(k));
    }
    return sum.coeff(mN);
  }
}
