package irvine.oeis.a032;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032174 Number of series-reduced planted compound windmills with n leaves of 2 colors with no symmetries.
 * @author Sean A. Irvine
 */
public class A032174 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> TWO = RING.monomial(Q.TWO, 1);
  private final Polynomial<Q> mA = TWO;
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA.add(A032171.chk(mA, mN).coeff(mN));
    }
    return mA.coeff(mN).toZ();
  }
}
