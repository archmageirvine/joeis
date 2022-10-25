package irvine.oeis.a036;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a045.A045648;

/**
 * A036365 Number of chiral n-ominoes in n-2 space.
 * @author Sean A. Irvine
 */
public class A036365 extends A045648 {

  /*
                                                                                       5
         3              2          4         2     2          2 2         4    8 C(x)
   4 C(x)  + 4 C(x) C(-x ) + 5 C(x)  + 2 C(x)  C(-x ) + 3 C(-x )  - 2 C(-x ) + --------
                                                                               1 - C(x)
   */

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NEG_X2 = RING.negate(RING.x()).shift(1);
  private static final Polynomial<Z> NEG_X4 = RING.negate(RING.x()).shift(3);
  private final Polynomial<Z> mC = RING.empty();
  {
    setOffset(3);
    mC.add(Z.ZERO);
    for (int k = 1; k < 3; ++k) {
      mC.add(super.next());
    }
  }
  private int mN = 2;

  @Override
  public Z next() {
    mC.add(super.next());
    ++mN;
    final Polynomial<Z> c2 = RING.substitute(mC, NEG_X2, mN);
    final Polynomial<Z> c4 = RING.substitute(mC, NEG_X4, mN);
    final Polynomial<Z> c2p2 = RING.multiply(c2, c2, mN);
    final Polynomial<Z> cp2 = RING.multiply(mC, mC, mN);
    final Polynomial<Z> cp3 = RING.multiply(cp2, mC, mN);
    final Polynomial<Z> cp4 = RING.multiply(cp3, mC, mN);
    final Polynomial<Z> cp5 = RING.multiply(cp4, mC, mN);
    final Polynomial<Z> a = RING.series(RING.multiply(cp5, Z.EIGHT), RING.subtract(RING.one(), mC), mN);
    return cp3.coeff(mN).multiply(4)
      .add(RING.multiply(mC, c2, mN).coeff(mN).multiply(4))
      .add(cp4.coeff(mN).multiply(5))
      .add(RING.multiply(cp2, c2, mN).coeff(mN).multiply2())
      .add(c2p2.coeff(mN).multiply(3))
      .subtract(c4.coeff(mN).multiply2())
      .add(a.coeff(mN))
      .divide(8);
  }
}
