package irvine.oeis.a007;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007286 E.g.f.: (sin x + cos 2x) / cos 3x.
 * @author Sean A. Irvine
 */
public class A007286 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> X2 = RING.create(Arrays.asList(Q.ZERO, Q.TWO));
  private static final Polynomial<Q> X3 = RING.create(Arrays.asList(Q.ZERO, Q.THREE));
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return RING.coeff(RING.add(RING.sin(RING.x(), mN), RING.cos(X2, mN)), RING.cos(X3, mN), mN).multiply(mF).toZ();
  }
}
