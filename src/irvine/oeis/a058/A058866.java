package irvine.oeis.a058;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058866.
 * @author Sean A. Irvine
 */
public class A058866 implements Sequence {

  // See p. 75 Harary and Palmer

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final CycleIndex A2Z2 = new CycleIndex("A2-S2",
    MultivariateMonomial.create(1, 2, Q.HALF),
    MultivariateMonomial.create(2, 1, Q.HALF.negate())
    );

  protected int mK = 0;
  private Polynomial<Q> mM1 = RING.x(); // A005750
  protected Polynomial<Q> mN1 = RING.zero();
  private Polynomial<Q> mM = RING.x(); // A063687
  protected Polynomial<Q> mN = RING.zero();

  protected void step() {
    if (++mK > 1) {
      final Polynomial<Q> n2 = RING.multiply(mN, Q.TWO);
      mM1 = RING.add(RING.one(), mM.substitutePower(2, mK), n2.substitutePower(2, mK)).shift(1);
      mN1 = A2Z2.apply(RING.add(RING.one(), mM, n2), mK).shift(1);
      final Polynomial<Q> s0 = RING.sum(1, mK, k -> RING.divide(RING.add(mM1.substitutePower(k, mK), mN1.substitutePower(2 * k, mK)), new Q(k)));
      mM = RING.subtract(RING.exp(s0, mK), RING.one());
      final Polynomial<Q> n12 = RING.multiply(mN1, Q.TWO);
      final Polynomial<Q> s1 = RING.sum(1, mK, k -> RING.divide(RING.add(mM1.substitutePower(k, mK), n12.substitutePower(k, mK)), new Q(k)));
      mN = RING.divide(RING.subtract(RING.subtract(RING.exp(s1, mK), RING.one()), mM), Q.TWO);
    }
  }

  @Override
  public Z next() {
    step();
    return mN.coeff(mK).add(mM.coeff(mK)).toZ();
  }
}

