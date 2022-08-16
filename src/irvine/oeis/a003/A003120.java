package irvine.oeis.a003;

import java.util.ArrayList;
import java.util.Arrays;

import irvine.math.group.PolynomialRing;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003120 Number of rooted trees with n nodes and omega-valency 1.
 * @author Sean A. Irvine
 */
public class A003120 implements Sequence {

  // After N. J. A. Sloane

  private static final PolynomialRingField<Q> RING_X = new PolynomialRingField<>("x", Rationals.SINGLETON);
  private static final PolynomialRing<Polynomial<Q>> RING_XY = new PolynomialRing<>("y", RING_X);

  private static Polynomial<Polynomial<Q>> s() {
    final Polynomial<Q> s1 = RING_X.create(Arrays.asList(Q.ZERO, Q.ONE, Q.ONE, Q.TWO, Q.THREE, Q.SEVEN));
    final Polynomial<Q> s2 = RING_X.create(Arrays.asList(Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ONE, Q.ONE));
    final Polynomial<Q> s3 = RING_X.monomial(Q.ONE, 5);
    return RING_XY.create(Arrays.asList(RING_X.zero(), s1, s2, s3));
  }

  private static Polynomial<Polynomial<Q>> innerTruncate(final Polynomial<Polynomial<Q>> p, final int truncate) {
    final ArrayList<Polynomial<Q>> newCoeff = new ArrayList<>();
    for (int k = 0; k <= p.degree(); ++k) {
      newCoeff.add(p.coeff(k).truncate(truncate));
    }
    return RING_XY.create(newCoeff);
  }

  private static Polynomial<Polynomial<Q>> expm1(final Polynomial<Polynomial<Q>> p, final int n) {
    Z f = Z.ONE;
    Polynomial<Polynomial<Q>> s = RING_XY.zero();
    if (!RING_XY.zero().equals(p)) {
      for (int k = 1; k <= n; ++k) {
        f = f.multiply(k);
        s = RING_XY.add(s, RING_XY.multiply(innerTruncate(RING_XY.pow(p, k, n), n), RING_X.monomial(new Q(Z.ONE, f), 0)));
      }
    }
    return s;
  }

  private static Polynomial<Polynomial<Q>> innerCoeff(final Polynomial<Polynomial<Q>> p, final int n) {
    final ArrayList<Polynomial<Q>> newCoeff = new ArrayList<>();
    for (int k = 0; k <= p.degree(); ++k) {
      newCoeff.add(RING_X.monomial(p.coeff(k).coeff(n), 0));
    }
    return RING_XY.create(newCoeff);
  }

  private int mN = 0;

  @Override
  public Z next() {
    Polynomial<Polynomial<Q>> s = s();
    ++mN;
    for (int n = 6; n <= mN; ++n) {
      Polynomial<Polynomial<Q>> t6 = RING_XY.zero();
      for (int k = 1; k <= n + 1; ++k) {
        t6 = RING_XY.add(t6, RING_XY.multiply(RING_XY.deepSubstitute(s, k, n + 1), RING_X.monomial(new Q(1, k), 0)));
      }
      final Polynomial<Polynomial<Q>> t8 = RING_XY.shift(PolynomialUtils.innerShift(RING_XY, expm1(t6, n + 1), 1), -1);
      final Polynomial<Q> xf1 = RING_XY.eval(RING_XY.shift(s, -1), RING_X.zero());
      final Polynomial<Polynomial<Q>> t11 = RING_XY.subtract(t8, RING_XY.monomial(xf1.shift(1), 0));
      final Polynomial<Polynomial<Q>> t12 = RING_XY.add(RING_XY.add(t11, RING_XY.monomial(xf1.shift(1), 1)), RING_XY.monomial(RING_X.x(), 1));
      final Polynomial<Polynomial<Q>> t13 = innerCoeff(t12, n);
      s = RING_XY.add(s, PolynomialUtils.innerShift(RING_XY, t13, n));
    }
    final Polynomial<Q> xf1 = RING_XY.eval(RING_XY.shift(s, -1), RING_X.zero());
    return xf1.coeff(mN).toZ();
  }
}
