package irvine.oeis.a000;

import irvine.math.IntegerUtils;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000132.
 * @author Sean A. Irvine
 */
public class A000132 implements Sequence {

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
