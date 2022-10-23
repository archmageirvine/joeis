package irvine.oeis.a058;

import java.util.Arrays;

import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058053 Number of 3-rowed binary matrices with n ones and no zero columns, up to row and column permutation.
 * @author Sean A. Irvine
 */
public class A058053 extends Sequence0 {

  private int mN = -1;

  /*
  > simplify(T(x,y));
                                               6  9    4  6    3  5    3  4    2  3
                                              x  y  + x  y  + x  y  + x  y  + x  y  + 1
                    ----------------------------------------------------------------------------------------------
                           3  6         3  3                              2           3         2  2         2  4
                    (-1 + x  y ) (-1 + x  y ) (x - 1) (-1 + x y) (-1 + x y ) (-1 + x y ) (-1 + x  y ) (-1 + x  y )
   */

  @Override
  public Z next() {
    ++mN;
    final DegreeLimitedPolynomialRingField<Q> inner = new DegreeLimitedPolynomialRingField<>(Rationals.SINGLETON, mN);
    final PolynomialRingField<Polynomial<Q>> ring = new PolynomialRingField<>("y", inner);
    final Polynomial<Polynomial<Q>> num = ring.create(Arrays.asList(
      inner.one(),  // 1
      inner.zero(), // 0*y
      inner.zero(), // 0*y^2
      inner.monomial(Q.ONE, 2), // x^2y^3
      inner.monomial(Q.ONE, 3), // x^3y^4
      inner.monomial(Q.ONE, 3), // x^3y^5
      inner.monomial(Q.ONE, 4), // x^4y^6
      inner.zero(), // 0*y^7
      inner.zero(), // 0*y^8
      inner.monomial(Q.ONE, 6) // x^6y^9
    ));
    final Polynomial<Q> neg1 = inner.negate(inner.one());
    final Polynomial<Polynomial<Q>> den = ring.multiply(ring.multiply(ring.multiply(ring.multiply(ring.multiply(ring.multiply(ring.multiply(
                  ring.monomial(inner.negate(inner.oneMinusXToTheN(1)), 0),
                  ring.create(Arrays.asList(neg1, inner.x())), mN),
                ring.create(Arrays.asList(neg1, inner.zero(), inner.x())), mN),
              ring.create(Arrays.asList(neg1, inner.zero(), inner.zero(), inner.x())), mN),
            ring.create(Arrays.asList(neg1, inner.zero(), inner.monomial(Q.ONE, 2))), mN),
          ring.create(Arrays.asList(neg1, inner.zero(), inner.zero(), inner.zero(), inner.monomial(Q.ONE, 4))), mN),
        ring.create(Arrays.asList(neg1, inner.zero(), inner.zero(), inner.monomial(Q.ONE, 3))), mN),
      ring.create(Arrays.asList(neg1, inner.zero(), inner.zero(), inner.zero(), inner.zero(), inner.zero(), inner.monomial(Q.ONE, 3))), mN);
    return ring.coeff(num, den, mN).coeff(mN).toZ();
  }
}
