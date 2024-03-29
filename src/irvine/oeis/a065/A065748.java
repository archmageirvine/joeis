package irvine.oeis.a065;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065748 Triangle of Gandhi polynomial coefficients.
 * @author Sean A. Irvine
 */
public class A065748 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mG = RING.monomial(Z.ONE, 4);
  private int mM = 3;

  @Override
  public Z next() {
    if (++mM > mG.degree()) {
      mG = RING.subtract(RING.substitute(mG, RING.onePlusXToTheN(1), Integer.MAX_VALUE), mG).shift(4);
      mM = 4;
    }
    return mG.coeff(mM);
  }
}
