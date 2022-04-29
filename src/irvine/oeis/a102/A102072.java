package irvine.oeis.a102;
// manually egfsi at 2022-04-29 11:22

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A102072 E.g.f. sec(arcsinh(x)) = cosec(arccosh(x)) (even powers only).
 * @author Georg Fischer
 */
public class A102072 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    if (mN != 0) {
      mF = mF.multiply(mN);
    }
    final Z result = RING.sec(RING.asinh(RING.x(), mN), mN).coeff(mN).multiply(mF).toZ();
    ++mN;
    mF = mF.multiply(mN);
    return result;
  }
}
