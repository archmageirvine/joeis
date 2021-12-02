package irvine.oeis.a052;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052872 A simple grammar.
 * @author Sean A. Irvine
 */
public class A052872 implements Sequence {

  protected static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  protected int mN = -1;
  protected Polynomial<Q> mA = RING.onePlusXToTheN(1);

  @Override
  public Z next() {
    if (++mN > 1) {
      Polynomial<Q> sum = RING.zero();
      for (int k = 1; k <= mN; ++k) {
        final Polynomial<Q> subs = mA.substitutePower(k, mN);
        sum = RING.add(sum, RING.divide(RING.series(subs, RING.subtract(RING.one(), subs.shift(k)), mN), new Q(k)).shift(k));
      }
      mA = RING.exp(sum, mN);
    }
    return mA.coeff(mN).toZ();
  }
}

