package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A012871 Numerator of [x^(2n)] in the Taylor expansion log(cot(x)*arctanh(x))= x^4/15 +x^6/15 +317*x^8/5670 +389*x^10/8505 +6895597*x^12/182432250 +...
 * @author Sean A. Irvine
 */
public class A012871 extends Sequence2 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 2;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mN += 2;
    return select(RING.log(RING.multiply(RING.xcot(RING.x(), mN + 1), RING.atanh(RING.x(), mN + 1), mN + 1).shift(-1), mN).coeff(mN));
  }
}
