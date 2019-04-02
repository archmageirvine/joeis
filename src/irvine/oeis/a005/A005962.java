package irvine.oeis.a005;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a000.A000625;

/**
 * A005962 Number of carbon trees with n carbon atoms.
 * @author Sean A. Irvine
 */
public class A005962 extends A000625 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);

  @Override
  public Z next() {
    super.next();
    final Polynomial<Z> a = RING.create(mT);
    final Polynomial<Z> gf = RING.add(RING.add(RING.pow(a, 4, mN),
        RING.multiply(RING.pow(a.substitutePower(2, mN), 2, mN), Z.THREE)),
      RING.multiply(RING.multiply(a, a.substitutePower(3, mN), mN), Z.EIGHT));
    return gf.coeff(mN).divide(12);
  }
}
