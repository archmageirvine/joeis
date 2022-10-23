package irvine.oeis.a030;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A030266 Shifts left under COMPOSE transform with itself.
 * @author Sean A. Irvine
 */
public class A030266 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mA = RING.zero();
  private int mN = -1;

  @Override
  public Z next() {
    mA = RING.add(RING.substitute(mA, mA, ++mN).shift(1), RING.x());
    return mA.coeff(mN);
  }
}
