package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a052.A052894;
import irvine.math.q.Rationals;
import irvine.math.q.Q;
import irvine.math.polynomial.Polynomial;
import irvine.math.group.PolynomialRingField;
import java.util.ArrayList;

/**
 * A000763.
 * @author Sean A. Irvine
 */
public class A000763 extends A052894 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  private final ArrayList<Q> mCoeff = new ArrayList<>();
  private Z mF = Z.ONE;
  private int mN = 0;

  {
    mCoeff.add(new Q(super.next()));
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    mCoeff.add(new Q(super.next(), mF));
    final Polynomial<Q> rootSquared = RING.pow(RING.create(mCoeff), 2, mN);
    final Polynomial<Q> integral = RING.integrate(rootSquared);
    final Polynomial<Q> egf = RING.exp(integral, mN);
    return egf.coeff(mN).multiply(mF).toZ();
  }
}
