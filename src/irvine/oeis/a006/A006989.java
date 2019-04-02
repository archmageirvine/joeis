package irvine.oeis.a006;

import java.util.ArrayList;
import java.util.List;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a000.A000670;

/**
 * A006989 Log of g.f. of numbers of preferential arrangements.
 * @author Sean A. Irvine
 */
public class A006989 extends A000670 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final List<Q> mB = new ArrayList<>();
  private Z mF = Z.ONE;
  private int mN = -1;

  {
    next();
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    mB.add(new Q(super.next(), mF));
    final Polynomial<Q> b = RING.create(mB);
    return RING.log1p(RING.integrate(b), mN).coeff(mN).multiply(mF).toZ();
  }
}
