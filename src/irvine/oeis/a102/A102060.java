package irvine.oeis.a102;
// manually egfsi at 2022-04-29 11:22

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A102060 Expansion of e.g.f. tan(arcsinh(x)) = cot(arccosh(x)).
 * @author Georg Fischer
 */
public class A102060 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    if (mN != 0) {
      mF = mF.multiply(mN);
    }
    ++mN;
    mF = mF.multiply(mN);
    return RING.tan(RING.asinh(RING.x(), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
