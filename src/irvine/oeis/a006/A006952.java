package irvine.oeis.a006;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006952 Number of conjugacy classes in <code>GL(n,3)</code>.
 * @author Sean A. Irvine
 */
public class A006952 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> num = RING.one();
    Polynomial<Z> den = RING.one();
    for (int k = 1; k <= mN; ++k) {
      num = RING.multiply(num, RING.oneMinusXToTheN(k), mN);
      den = RING.multiply(den, RING.oneMinusXToTheN(Z.THREE, k), mN);
    }
    return RING.coeff(num, den, mN);
  }
}
