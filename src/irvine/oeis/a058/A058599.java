package irvine.oeis.a058;

import java.util.Collections;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A058599 McKay-Thompson series of class 27A for the Monster group.
 * @author Sean A. Irvine
 */
public class A058599 extends A058091 {

  private static final Polynomial<Z> C6 = RING.monomial(Z.SIX, 3);
  private final Polynomial<Z> mT = RING.create(Collections.emptyList());
  private int mN = -1;

  @Override
  public Z next() {
    mT.add(super.next());
    mT.add(Z.ZERO);
    mT.add(Z.ZERO);
    final Polynomial<Z> a = RING.add(mT.substitutePower(3, ++mN), C6);
    final Polynomial<Z> b = RING.series(mT, a, mN + 10).shift(2);
    final Polynomial<Z> c = RING.series(mT, RING.subtract(RING.one(), RING.multiply(b, Z.THREE)), mN);
    return c.coeff(mN);
  }
}
