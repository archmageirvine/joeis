package irvine.oeis.a002;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.Series;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002909 Low temperature energy function for square lattice.
 * @author Sean A. Irvine
 */
public class A002909 extends Sequence0 {

  // Cf. A002908.

  protected static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> NUM = RING.multiply(RING.monomial(Q.FOUR, 1), RING.oneMinusXToTheN(2));
  private static final Polynomial<Q> C2 = RING.onePlusXToTheN(2);
  private static final Polynomial<Q> DEN = RING.pow(C2, 2);
  private static final Polynomial<Q> C1 = RING.create(Arrays.asList(Q.ONE, Q.ZERO, new Q(-6), Q.ZERO, Q.ONE));
  private int mN = -2;

  private Polynomial<Q> getU(final int n) {
    final Polynomial<Q> z = RING.series(NUM, DEN, n);
    final Polynomial<Q> x = RING.series(RING.oneMinusXToTheN(1), RING.onePlusXToTheN(1), n);
    final Polynomial<Q> ek = Series.ELLIPTIC_K.s(n, z);
    final Polynomial<Q> c1 = RING.substitute(C1, x, n);
    final Polynomial<Q> c2 = RING.substitute(C2, x, n);
    final Polynomial<Q> den = RING.substitute(DEN, x, n);
    return RING.series(RING.multiply(RING.multiply(c2, RING.subtract(RING.one(), RING.series(RING.multiply(c1, ek, n), den, n)), n), Q.HALF), x, mN);
  }

  @Override
  public Z next() {
    mN += 2;
    return getU(mN).coeff(mN).toZ();
  }
}

