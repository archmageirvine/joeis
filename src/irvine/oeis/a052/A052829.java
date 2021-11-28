package irvine.oeis.a052;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052829 A simple grammar.
 * @author Sean A. Irvine
 */
public class A052829 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> X1 = RING.oneMinusXToTheN(1);
  private int mN = -1;
  private Polynomial<Q> mA = RING.zero();

  @Override
  public Z next() {
    if (++mN > 0) {
      Polynomial<Q> sum = RING.zero();
      for (int k = 1; k <= mN; ++k) {
        sum = RING.signedAdd((k & 1) == 1, sum, RING.divide(mA.substitutePower(k, mN), new Q(k)));
      }
      mA = RING.series(RING.exp(sum, mN).shift(1), X1, mN);
    }
    return mA.coeff(mN).toZ();
  }
}

