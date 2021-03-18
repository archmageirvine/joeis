package irvine.oeis.a045;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A045649 Number of chiral n-ominoes in n-1 space.
 * @author Sean A. Irvine
 */
public class A045649 extends A045648 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> X2 = Polynomial.create(0, 0, -1);
  private final Polynomial<Z> mC = RING.empty();
  {
    mC.add(Z.ZERO);
  }
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    mC.add(super.next());
    return RING.substitute(mC, X2, mN).coeff(mN).subtract(RING.multiply(mC, mC, mN).coeff(mN)).divide2().add(mC.coeff(mN));
  }
}
