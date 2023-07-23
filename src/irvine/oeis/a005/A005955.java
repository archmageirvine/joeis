package irvine.oeis.a005;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a000.A000625;

/**
 * A005955 Number of acyclic secondary alcohols with n carbon atoms.
 * @author Sean A. Irvine
 */
public class A005955 extends A000625 {

  {
    setOffset(3);
  }

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    super.next();
    final Polynomial<Z> a = RING.create(mT);
    final Polynomial<Z> gf = RING.pow(RING.subtract(a, RING.one()), 2, mN);
    return gf.coeff(mN);
  }
}
