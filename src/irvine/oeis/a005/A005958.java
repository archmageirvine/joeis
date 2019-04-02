package irvine.oeis.a005;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a000.A000625;

/**
 * A005958 Number of esters with n carbon atoms.
 * @author Sean A. Irvine
 */
public class A005958 extends A000625 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);

  {
    super.next();
  }

  @Override
  public Z next() {
    super.next();
    final Polynomial<Z> a = RING.create(mT);
    final Polynomial<Z> gf = RING.multiply(a, RING.subtract(a, RING.one()), mN);
    return gf.coeff(mN);
  }
}
