package irvine.oeis.a052;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052870 A simple grammar.
 * @author Sean A. Irvine
 */
public class A052870 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Polynomial<Q> mS = RING.onePlusXToTheN(1);

  @Override
  public Z next() {
    if (++mN > 1) {
      final Polynomial<Q> b = RING.subtract(RING.series(mS, RING.oneMinusXToTheN(1), mN), mS);
      mS = RING.zero();
      for (int j = 1; j <= mN; ++j) {
        mS = RING.signedAdd((j & 1) == 1, mS, RING.divide(b.substitutePower(j, mN), new Q(j)));
      }
      mS = RING.exp(mS, mN);
    }
    return mS.coeff(mN).toZ();
  }
}

