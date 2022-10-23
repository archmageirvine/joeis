package irvine.oeis.a003;

import java.util.Arrays;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003611 Symmetries in planted 3-trees on n+1 vertices.
 * @author Sean A. Irvine
 */
public class A003611 extends Sequence1 {

  // Note formula for S_n in McKeon articles is wrong, should be
  // S_n = Sum_{k=0..n} T(k, n) * 2^k

  // T(x,y) = x + (x/2)T(x,y)^2 + xT(x,y) + x(y-1/2)T(x^2,y^2)
  // T(x,y) = x(1 + T(x,y) + (1/2)T(x,y)^2 + (y-1/2)T(x^2,y^2))

  protected static final PolynomialRing<Q> RING_Y = new PolynomialRing<>("y", Rationals.SINGLETON);
  protected static final PolynomialRing<Polynomial<Q>> RING = new PolynomialRing<>(RING_Y);
  private static final Polynomial<Q> C0 = RING_Y.monomial(Q.HALF, 0);
  private static final Polynomial<Q> C1 = RING_Y.create(Arrays.asList(Q.HALF.negate(), Q.ONE));
  protected Polynomial<Polynomial<Q>> mT = RING.x();
  protected int mN = 0;

  @Override
  public Z next() {
    ++mN;

    // Do the y^2 substitution
    final Polynomial<Polynomial<Q>> subs = PolynomialUtils.innerSubstitute(RING, mT, 2, mN);

    // Apply the T(x,y) relation
    final Polynomial<Polynomial<Q>> s = RING.multiply(subs.substitutePower(2, mN), C1);
    final Polynomial<Polynomial<Q>> u = RING.add(RING.add(RING.one(), mT), RING.multiply(RING.pow(mT, 2, mN), C0));
    mT = RING.add(u, s).shift(1);

    // Compute S_n
    return RING_Y.eval(mT.coeff(mN), Q.TWO).toZ();
  }
}

