package irvine.oeis.a058;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a001.A001349;

/**
 * A058915 Number of graphs with 3 distinct components.
 * @author Sean A. Irvine
 */
public class A058915 extends A001349 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final Polynomial<Z> mF = RING.empty();

  {
    setOffset(6);
    mF.add(Z.ZERO);
    super.next();
  }

  @Override
  public Z next() {
    while (mN < 5) {
      mF.add(super.next());
    }
    mF.add(super.next());
    return RING.pow(mF, 3, mN).coeff(mN)
      .subtract(RING.multiply(mF, mF.substitutePower(2, mN), mN).coeff(mN).multiply(3))
      .add(mF.substitutePower(3, mN).coeff(mN).multiply2())
      .divide(6);
  }
}
