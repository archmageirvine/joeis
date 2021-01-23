package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009764 Tan(x)^2 = sum(n&gt;=0, a(n)*x^(2*n)/(2*n)! ).
 * @author Sean A. Irvine
 */
public class A009764 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 0) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN).multiply(mN - 1);
    return RING.pow(RING.tan(RING.x(), mN), 2, mN).coeff(mN).multiply(mF).toZ();
  }
}
