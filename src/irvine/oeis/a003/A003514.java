package irvine.oeis.a003;

import java.util.Arrays;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003514.
 * @author Sean A. Irvine
 */
public class A003514 implements Sequence {

  protected static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> P = RING.create(Arrays.asList(Q.ZERO, Q.HALF, new Q(-1, 4)));
  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;

  protected Polynomial<Q> egf(final int n) {
    Polynomial<Q> egf = RING.zero();
    final Polynomial<Q> s1 = RING.series(RING.negate(RING.x()), RING.onePlusXToTheN(1), n);
    final Polynomial<Q> s2 = RING.series(RING.monomial(Q.HALF, 2), RING.onePlusXToTheN(1), n);
    for (int k = 0; k <= n; ++k) {
      final int b = k * (k - 1) / 2;
      final Polynomial<Q> e1 = RING.pow(RING.multiply(RING.exp(s1, n), Q.TWO), b, n);
      final Polynomial<Q> e2 = RING.pow(RING.exp(s2, n), k, n);
      final Polynomial<Q> e1e2 = RING.multiply(e1, e2, n);
      final Polynomial<Q> t = RING.shift(RING.multiply(e1e2, new Q(Z.ONE, mF.factorial(k))), k);
      egf = RING.add(egf, t);
    }
    egf = RING.multiply(egf, RING.exp(P, n), n);
    return RING.multiply(egf, RING.series(RING.one(), RING.sqrt1p(RING.x(), n), n), n);
  }

  @Override
  public Z next() {
    ++mN;
    return egf(mN).coeff(mN).multiply(mF.factorial(mN)).toZ();
  }
}
