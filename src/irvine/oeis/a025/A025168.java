package irvine.oeis.a025;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A025168 E.g.f.: exp(x/(1-2*x)).
 * @author Sean A. Irvine
 */
public class A025168 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C = RING.create(Arrays.asList(Q.ONE, new Q(-2)));
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return RING.exp(RING.series(RING.x(), C, mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
