package irvine.oeis.a002;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;


/**
 * A002408 Expansion of 8-dimensional cusp form.
 * @author Sean A. Irvine
 */
public class A002408 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    Polynomial<Z> p = RING.one();
    for (int k = 1; k < mN; ++k) {
      p = RING.multiply(p, RING.oneMinusXToTheN(2 * k - 1), mN);
      p = RING.multiply(p, RING.oneMinusXToTheN(4 * k), mN);
    }
    return RING.pow(p, 8, mN).coeff(mN - 1);
  }
}
