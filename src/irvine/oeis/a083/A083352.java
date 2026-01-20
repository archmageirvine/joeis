package irvine.oeis.a083;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.predicate.Predicates;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A083352 Least positive integer coefficients of power series A(x) such that the coefficients of A(x)^2 + A(x) - 1 consist entirely of squares.
 * @author Sean A. Irvine
 */
public class A083352 extends Sequence0 {

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
          break;
        }
      }
    }
    return mA.coeff(mN);
  }
}
