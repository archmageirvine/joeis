package irvine.oeis.a007;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007289 E.g.f.: <code>(sin 2x +</code> cos <code>x) /</code> cos <code>3x</code>.
 * @author Sean A. Irvine
 */
public class A007289 implements Sequence {

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
    return RING.coeff(RING.add(RING.cos(RING.x(), mN), RING.sin(X2, mN)), RING.cos(X3, mN), mN).multiply(mF).toZ();
  }
}
