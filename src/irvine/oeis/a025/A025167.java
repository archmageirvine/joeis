package irvine.oeis.a025;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025167 E.g.f: <code>exp(x/(1-2*x))/(1-2*x)</code>.
 * @author Sean A. Irvine
 */
public class A025167 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C = RING.create(Arrays.asList(Q.ONE, new Q(-2)));
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return RING.coeff(RING.exp(RING.series(RING.x(), C, mN), mN), C, mN).multiply(mF).toZ();
  }
}
