package irvine.oeis.a075;

import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a053.A053657;

/**
 * A075263.
 * @author Sean A. Irvine
 */
public class A075264 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> NEG_X = RING.negate(RING.x());
  private final DirectSequence mD = DirectSequence.create(new A053657());
  private int mN = 0;
  private int mM = 0;
  private Polynomial<Polynomial<Q>> mP = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
      final DegreeLimitedPolynomialRingField<Q> inner = new DegreeLimitedPolynomialRingField<>(Rationals.SINGLETON, mN);
      final PolynomialRingField<Polynomial<Q>> ring = new PolynomialRingField<>("z", inner);
      final Polynomial<Q> log = inner.negate(inner.log1p(NEG_X, mN + 1)).shift(-1);
      mP = ring.exp(ring.monomial(inner.log(log, mN), 1), mN);
    }
    return mP.coeff(mM).coeff(mN).multiply(mD.a(mN + 1)).num();
  }
}
