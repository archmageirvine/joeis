package irvine.oeis.a068;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068369 Numerators of coefficients of a formal power series solution of f''(x) = f(f(x)).
 * @author Sean A. Irvine
 */
public class A068369 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final PolynomialRingField<Polynomial<Q>> RING2 = new PolynomialRingField<>(RING);
  private final Polynomial<Q> mF = RING.empty();
  private Z mFactorial = Z.ONE;
  private int mN = -1;
  {
    mF.add(Q.ZERO);
    mF.add(Q.ONE);
  }

  @Override
  public Z next() {
    mN += 2;
    if (mN > 1) {
      mFactorial = mFactorial.multiply(mN).multiply(mN - 1);
      final Polynomial<Polynomial<Q>> liftF = PolynomialUtils.lift(mF);
      liftF.add(RING.zero());
      liftF.add(RING.monomial(Q.ONE, 1));
      final Polynomial<Polynomial<Q>> fdd = RING2.diff(RING2.diff(liftF));
      final Polynomial<Polynomial<Q>> ff = RING2.substitute(liftF, liftF, mN);
      final Polynomial<Polynomial<Q>> t = RING2.subtract(fdd, ff);
      mF.add(Q.ZERO);
      final Polynomial<Q> v = t.coeff(mN - 2);
      final Q u = v.coeff(0).divide(v.coeff(1));
      mF.add(u.negate());
    }
    return mF.coeff(mN).multiply(mFactorial).toZ();
  }
}

