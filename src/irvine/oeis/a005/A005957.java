package irvine.oeis.a005;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a000.A000625;

/**
 * A005957 Number of acyclic ketone and aldehyde stereo-isomers with n carbon atoms.
 * @author Sean A. Irvine
 */
public class A005957 extends A000625 {

  {
    setOffset(1);
  }

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);

  @Override
  public Z next() {
    super.next();
    final Polynomial<Z> a = RING.create(mT);
    final Polynomial<Z> gf = RING.add(RING.pow(a, 2, mN), a.substitutePower(2, mN));
    return gf.coeff(mN).divide2();
  }
}
