package irvine.oeis.a030;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030277 Shifts left 2 places under COMPOSE transform.
 * @author Sean A. Irvine
 */
public class A030277 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mA = RING.zero();
  private int mN = 0;

  @Override
  public Z next() {
    mA = RING.add(RING.add(RING.substitute(mA, mA, ++mN), RING.one()).shift(2), RING.x());
    return mA.coeff(mN);
  }
}
