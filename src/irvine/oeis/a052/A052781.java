package irvine.oeis.a052;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052781 G.f. A(x) satisfies: A(x) = exp( Sum_{k&gt;=1} A(x^k)^5 * x^k / k ).
 * @author Sean A. Irvine
 */
public class A052781 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Polynomial<Q> mA = RING.onePlusXToTheN(1);

  @Override
  public Z next() {
    if (++mN > 0) {
      final Polynomial<Q> a5 = RING.pow(mA, 5, mN - 1).shift(1);
      Polynomial<Q> sum = RING.zero();
      for (int k = 1; k <= mN; ++k) {
        sum = RING.add(sum, RING.divide(a5.substitutePower(k, mN), new Q(k)));
      }
      mA = RING.exp(sum, mN);
    }
    return mA.coeff(mN).toZ();
  }
}
