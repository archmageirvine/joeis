package irvine.oeis.a000;

import irvine.math.IntegerUtils;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000132 Number of ways of writing n as a sum of 5 squares.
 * @author Sean A. Irvine
 */
public class A000132 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private int mN = -1;
  private int mLimit = 1;
  private Polynomial<Z> mP = Polynomial.create(1, 2);
  private Polynomial<Z> mQ = RING.pow(mP, 5);

  @Override
  public Z next() {
    if (IntegerUtils.sqrt(++mN) > mLimit) {
      if (++mLimit > 46340) {
        throw new UnsupportedOperationException();
      }
      mP = RING.add(mP, RING.monomial(Z.TWO, mLimit * mLimit));
      mQ = RING.pow(mP, 5);
    }
    return mQ.coeff(mN);
  }
}
