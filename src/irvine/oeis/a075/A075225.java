package irvine.oeis.a075;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060691 Expansion of AGM(1,1-8x) (where AGM denotes the arithmetic-geometric mean).
 * @author Sean A. Irvine
 */
public class A075225 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Polynomial<Q> a = RING.one();
    Polynomial<Q> g = RING.oneMinusXToTheN(Q.EIGHT, 1);
    for (int k = 1; k <= mN; ++k) {
      final Polynomial<Q> ap = RING.multiply(RING.add(a, g), Q.HALF);
      final Polynomial<Q> gp = RING.sqrt(RING.multiply(a, g, mN), mN);
      a = ap;
      g = gp;
    }
    return g.coeff(mN).toZ().negate();
  }
}
