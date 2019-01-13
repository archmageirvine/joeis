package irvine.oeis.a003;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a128.A128663;

/**
 * A003295.
 * @author Sean A. Irvine
 */
public class A003295 extends A128663 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -2;
  private Polynomial<Z> mF = RING.zero();

  @Override
  public Z next() {
    ++mN;
    mF = RING.add(mF, RING.monomial(super.next(), mN + 2));
    if (mN == -1) {
      return Z.ONE;
    }
    if (mN == 0) {
      return Z.valueOf(-5);
    }
    final Polynomial<Z> f3p1 = RING.add(RING.one(), RING.multiply(mF, Z.THREE));
    final Polynomial<Z> gf = RING.add(RING.series(RING.pow(f3p1, 2, mN + 3), mF.shift(-1), mN + 2).shift(-1), RING.pow(f3p1, 3, mN));
    return gf.coeff(mN);
  }
}
