package irvine.oeis.a058;

import java.util.Collections;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * A058742 McKay-Thompson series of class 68A for Monster.
 * @author Sean A. Irvine
 */
public class A058742 extends A058638 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mT = RING.create(Collections.emptyList());
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    mT.add(new Q(super.next().add(mN == 1 ? 2 : 0)));
    final Polynomial<Q> c = RING.sqrt(mT, mN);
    return c.coeff(mN).toZ();
  }
}
