package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A012981 arctanh(arctan(x)+sin(x))=2*x+13/3!*x^3+553/5!*x^5+57839/7!*x^7...
 * @author Sean A. Irvine
 */
public class A012981 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 1) {
      return Z.TWO;
    }
    mF = mF.multiply(mN).multiply(mN - 1);
    return RING.atanh(RING.add(RING.atan(RING.x(), mN), RING.sin(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
