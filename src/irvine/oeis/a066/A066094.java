package irvine.oeis.a066;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066094 Type D Eulerian triangle.
 * @author Sean A. Irvine
 */
public class A066094 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;
  private Polynomial<Polynomial<Q>> mGf = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      final DegreeLimitedPolynomialRingField<Q> inner = new DegreeLimitedPolynomialRingField<>("x", Rationals.SINGLETON, mN);
      final PolynomialRingField<Polynomial<Q>> ring = new PolynomialRingField<>("z", inner);
      final Polynomial<Q> x1 = inner.oneMinusXToTheN(1);
      final Polynomial<Polynomial<Q>> a = ring.multiply(ring.exp(ring.monomial(x1, 1), mN), x1);
      final Polynomial<Polynomial<Q>> exp2 = ring.exp(ring.monomial(inner.multiply(x1, Q.TWO), 1), mN);
      final Polynomial<Polynomial<Q>> num = ring.subtract(a, ring.multiply(exp2, x1.shift(1)).shift(1));
      final Polynomial<Polynomial<Q>> den = ring.subtract(ring.one(), ring.multiply(exp2, inner.x()));
      mGf = ring.series(num, den, mN);
      mM = 0;
    }
    return mGf.coeff(mN).coeff(mM).multiply(MemoryFactorial.SINGLETON.factorial(mN)).toZ().max(Z.ONE);
  }
}
