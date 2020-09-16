package irvine.oeis.a058;

import java.util.Collections;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * A058657 McKay-Thompson series of class 38A for Monster.
 * @author Sean A. Irvine
 */
public class A058657 extends A058549 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C = RING.monomial(new Q(17, 4), 2);
  private final Polynomial<Q> mT = RING.create(Collections.emptyList());
  private int mN = -1;

  @Override
  public Z next() {
    mT.add(new Q(super.next()));
    if (++mN <= 1) {
      return mN == 0 ? Z.ONE : Z.ZERO;
    }
    final Polynomial<Q> a = RING.add(RING.add(mT.shift(1), mT.substitutePower(2, mN)), C);
    return RING.sqrt(a, mN).coeff(mN).toZ();
  }
}
