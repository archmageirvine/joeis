package irvine.oeis.a035;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A035343 Triangle of coefficients in expansion of (1 + x + x^2 + x^3 + x^4)^n.
 * @author Sean A. Irvine
 */
public class A035343 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> C = Polynomial.create(1, 1, 1, 1, 1);
  private Polynomial<Z> mP = RING.one();
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mP.degree()) {
      mP = RING.multiply(mP, C);
      mM = 0;
    }
    return mP.coeff(mM);
  }
}

