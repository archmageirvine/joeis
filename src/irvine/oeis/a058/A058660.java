package irvine.oeis.a058;

import java.util.Collections;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a034.A034319;

/**
 * A058660 McKay-Thompson series of class 39B for Monster.
 * @author Sean A. Irvine
 */
public class A058660 extends A034319 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mT = RING.create(Collections.emptyList());
  private int mN = -1;

  @Override
  public Z next() {
    mT.add(new Q(super.next().add(++mN == 1 ? 3 : 0)));
    final Polynomial<Q> c = RING.pow(mT, Q.ONE_THIRD, mN);
    return c.coeff(mN).toZ();
  }
}
