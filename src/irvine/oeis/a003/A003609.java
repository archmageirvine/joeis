package irvine.oeis.a003;

import java.util.Arrays;
import java.util.Collections;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003609 Symmetries in planted <code>(1,3)</code> trees on <code>2n</code> vertices.
 * @author Sean A. Irvine
 */
public class A003609 implements Sequence {

  // Note formula for S_n in McKeon articles is wrong, should be
  // S_n = Sum_{k=0..n} T(k, n) * 2^k

  // T(x,y) = x + (1/2)T(x,y)^2 + (y-1/2)T(x^2,y^2)

  protected static final PolynomialRing<Q> RING_Y = new PolynomialRing<>("y", Rationals.SINGLETON);
  protected static final PolynomialRing<Polynomial<Q>> RING = new PolynomialRing<>(RING_Y);
  private static final Polynomial<Q> C0 = RING_Y.monomial(Q.HALF, 0);
  private static final Polynomial<Q> C1 = RING_Y.create(Arrays.asList(Q.HALF.negate(), Q.ONE));
  protected Polynomial<Polynomial<Q>> mT = RING.x();
  protected int mN = 0;

  protected Polynomial<Polynomial<Q>> innerSubstitute(final Polynomial<Polynomial<Q>> t, final int power, final int n) {
    final Polynomial<Polynomial<Q>> subs = RING.create(Collections.emptyList());
    for (final Polynomial<Q> v : t) {
      subs.add(v.substitutePower(power, n));
    }
    return subs;
  }

  @Override
  public Z next() {
    ++mN;

    // Do the y^2 substitution
    final Polynomial<Polynomial<Q>> subs = innerSubstitute(mT, 2, mN);

    // Apply the T(x,y) relation
    final Polynomial<Polynomial<Q>> s = RING.multiply(subs.substitutePower(2, mN), C1);
    mT = RING.add(RING.add(RING.x(), RING.multiply(RING.pow(mT, 2, mN), C0)), s);

    // Compute S_n
    return RING_Y.eval(mT.coeff(mN), Q.TWO).toZ();
  }
}

