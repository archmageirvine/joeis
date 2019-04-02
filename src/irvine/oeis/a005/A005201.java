package irvine.oeis.a005;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A005201 Total number of fixed points in trees with n nodes.
 * @author Sean A. Irvine
 */
public class A005201 extends A005200 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 0;

  {
    super.next();
  }

  @Override
  public Z next() {
    super.next();
    ++mN;
    final Polynomial<Z> f2 = RING.create(this).substitutePower(2);
    final Polynomial<Z> t = RING.create(mT);
    final Polynomial<Z> g = RING.subtract(RING.multiply(t, RING.subtract(RING.one(), f2), mN), f2);
    return g.coeff(mN);
  }
}
