package irvine.oeis.a006;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006789.
 * @author Sean A. Irvine
 */
public class A006789 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X1 = Polynomial.create(1, 1);
  private static final Polynomial<Z> X2 = RING.oneMinusXToTheN(1);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> a = RING.zero();
    for (int k = 0; k <= mN / 2; ++k) {
      final Polynomial<Z> s = RING.series(RING.x(), X2, mN);
      a = RING.substitute(RING.series(X1, RING.subtract(RING.one(), a.shift(2)), mN), s, mN);
    }
    return a.coeff(mN);
  }
}
