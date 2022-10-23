package irvine.oeis.a006;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006265 Number of shapes of height-balanced AVL trees with n nodes.
 * @author Sean A. Irvine
 */
public class A006265 extends Sequence1 {

  // After Alois P. Heinz

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;

  private Polynomial<Z> b(final Polynomial<Z> x, final Polynomial<Z> y, final int d, final int a, final int b) {
    if (a + b <= d) {
      return RING.add(x, b(RING.add(RING.pow(x, 2, d), RING.multiply(RING.multiply(x, y, d), Z.TWO)), x, d, a + b, a));
    } else {
      return x;
    }
  }

  @Override
  public Z next() {
    return b(RING.x(), RING.zero(), ++mN, 1, 1).coeff(mN);
  }
}

