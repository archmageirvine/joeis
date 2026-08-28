package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086376 Maximal coefficient of the polynomial (1-x)*(1-x^2)*...*(1-x^n).
 * @author Sean A. Irvine
 */
public class A086376 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mP = RING.one();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mP = RING.multiply(mP, RING.oneMinusXToTheN(mN));
    }
    return Functions.MAX.z(mP);
  }
}

