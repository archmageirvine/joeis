package irvine.oeis.a007;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007856 Subtrees in rooted plane trees on n nodes.
 * @author Sean A. Irvine
 */
public class A007856 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> X4 = RING.monomial(new Q(4), 1);
  private static final Polynomial<Q> C1 = RING.create(Arrays.asList(Q.ONE, new Q(-10)));

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Q> s = RING.sqrt1m(X4, mN);
    final Polynomial<Q> a = RING.add(RING.one(), RING.series(RING.one(), s, mN));
    final Polynomial<Q> b = RING.multiply(RING.sqrt(RING.divide(RING.add(C1, s), Q.TWO), mN), Q.TWO);
    final Polynomial<Q> c = RING.subtract(RING.add(RING.one(), s), b);
    final Polynomial<Q> gf = RING.multiply(a, c, mN);
    return gf.coeff(mN).toZ().divide(8);
  }
}
