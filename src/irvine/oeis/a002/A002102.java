package irvine.oeis.a002;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002102 Number of nonnegative solutions to <code>x^2 +</code> y^2 + z^2 <code>= n</code>.
 * @author Sean A. Irvine
 */
public class A002102 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;
  private int mS = 1;
  private Polynomial<Z> mPoly = RING.one();

  @Override
  public Z next() {
    ++mN;
    if (mPoly.degree() < mN) {
      mPoly = RING.add(mPoly, RING.monomial(Z.ONE, mS * mS));
      ++mS;
    }
    return RING.pow(mPoly, 3, mN).coeff(mN);
  }
}
