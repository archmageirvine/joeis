package irvine.oeis.a058;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058585 An approximation to A000084(n).
 * @author Sean A. Irvine
 */
public class A058585 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C1 = Polynomial.create(Q.FIVE, Q.THREE.negate(), Q.TWO.negate());
  private static final Polynomial<Q> C2 = Polynomial.create(Q.ONE, new Q(-30, 9), new Q(-11, 9), new Q(12, 9), new Q(4, 9));
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return C1.coeff(mN).subtract(RING.sqrt(C2, mN).coeff(mN).multiply(3)).multiply(Q.HALF).toZ();
  }
}
