package irvine.oeis.a007;

import java.util.Collections;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007855 Infima closed sets in rooted plane trees on n nodes.
 * @author Sean A. Irvine
 */
public class A007855 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> X4 = RING.monomial(Q.FOUR, 1);
  private static final Polynomial<Q> C2 = RING.create(Collections.singletonList(Q.TWO));
  private static final Polynomial<Q> C3 = RING.create(Collections.singletonList(Q.THREE));

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Q> s = RING.sqrt1m(X4, mN);
    final Polynomial<Q> a = RING.add(RING.one(), s);
    final Polynomial<Q> b = RING.subtract(RING.one(), RING.sqrt(RING.subtract(C3, RING.series(C2, s, mN)), mN));
    final Polynomial<Q> gf = RING.multiply(a, b, mN);
    return gf.coeff(mN).toZ().divide(4);
  }
}
