package irvine.oeis.a083;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.predicate.Predicates;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A083353 Coefficients of power series A(x) consist entirely of squares, where A(x) = A083352(x)^2 + A083352(x) - 1.
 * @author Sean A. Irvine
 */
public class A083353 extends Sequence0 {

  private int mN = -1;
  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final Polynomial<Z> mA = Polynomial.create(1);

  @Override
  public Z next() {
    if (++mN > mA.degree()) {
      mA.add(Z.ZERO);
      long k = 0;
      while (true) {
        ++k;
        mA.set(mN, Z.valueOf(k));
        final Polynomial<Z> f = RING.multiply(mA, mA, mN);
        final Z t = f.coeff(mN).add(mA.coeff(mN));
        if (Predicates.SQUARE.is(t)) {
          return t;
        }
      }
    }
    return mA.coeff(mN);
  }
}
