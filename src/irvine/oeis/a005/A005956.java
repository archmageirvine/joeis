package irvine.oeis.a005;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a000.A000625;

/**
 * A005956.
 * @author Sean A. Irvine
 */
public class A005956 extends A000625 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    super.next();
    final Polynomial<Z> a = RING.create(mT);
    final Polynomial<Z> gf = RING.add(RING.pow(RING.subtract(a, RING.one()), 3, mN),
      RING.multiply(RING.subtract(a.substitutePower(3, mN), RING.one()), Z.TWO));
    return gf.coeff(mN).divide(3);
  }
}
