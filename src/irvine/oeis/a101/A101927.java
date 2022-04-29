package irvine.oeis.a101;
// manually egfsi at 2022-04-29 11:22

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A101927 E.g.f. of sin(arcsinh(x)) = cos(arccosh(x)) (odd powers only).
 * E.g.f.:
 * @author Georg Fischer
 */
public class A101927 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    mF = mF.multiply(mN);
    final Z result = RING.sin(RING.asinh(RING.x(), mN), mN).coeff(mN).multiply(mF).toZ();
    ++mN;
    mF = mF.multiply(mN);
    return result;
  }
}
