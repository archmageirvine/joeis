package irvine.oeis.a052;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052751 A simple grammar.
 * @author Sean A. Irvine
 */
public class A052751 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Polynomial<Q> mA = RING.onePlusXToTheN(1);

  @Override
  public Z next() {
    if (++mN > 0) {
      final Polynomial<Q> a3 = RING.pow(mA, 3, mN - 1).shift(1);
      Polynomial<Q> sum = RING.zero();
      for (int k = 1; k <= mN; ++k) {
        sum = RING.add(sum, RING.divide(a3.substitutePower(k, mN), new Q(k)));
      }
      mA = RING.exp(sum, mN);
    }
    return mA.coeff(mN).toZ();
  }
}
