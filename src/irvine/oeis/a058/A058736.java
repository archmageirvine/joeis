package irvine.oeis.a058;

import java.util.Collections;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * A058736 McKay-Thompson series of class 62A for Monster.
 * @author Sean A. Irvine
 */
public class A058736 extends A058628 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mT = RING.create(Collections.emptyList());
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    mT.add(new Q(super.next()));
    final Polynomial<Q> c = RING.pow(RING.multiply(mT, mT.substitutePower(2, mN), mN), Q.ONE_THIRD, mN);
    return c.coeff(mN).toZ();
  }
}
