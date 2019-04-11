package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013547 Numerator of the coefficient <code>[x^(2n)]</code> of the Taylor expansion sec(cosec(x)-coth(x))= <code>1+x^2/72 -211*x^4/31104 +169339*x^6/235146240 -205787*x^8/13544423424+..</code>.
 * @author Sean A. Irvine
 */
public class A013547 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return RING.sec(RING.subtract(RING.xcsc(RING.x(), mN + 1), RING.xcoth(RING.x(), mN + 1)).shift(-1), mN).coeff(mN).num();
  }
}
