package irvine.oeis.a137;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A137347 Triangular sequence from coefficients of a polynomial recursion: p(x, n) = x*p(x, n - 1) - 2*x^2*p(x, n - 2) + x^3*p(x, n - 3).
 * @author Sean A. Irvine
 */
public class A137347 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mA = RING.zero();
  private Polynomial<Z> mB = null;
  private Polynomial<Z> mC = null;
  private int mM = -1;

  @Override
  public Z next() {
    if (mC == null) {
      if (mB == null) {
        mB = RING.one();
        return Z.ONE;
      }
      mC = Polynomial.create(-1, 1);
    }
    if (++mM > mC.degree()) {
      final Polynomial<Z> t = RING.add(RING.subtract(mC.shift(1), RING.multiply(mB, Z.TWO).shift(2)), mA.shift(3));
      mA = mB;
      mB = mC;
      mC = t;
      mM = 0;
    }
    return mC.coeff(mM);
  }
}
