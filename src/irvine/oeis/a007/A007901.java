package irvine.oeis.a007;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007901 Number of minimal unavoidable n-celled pebbling configurations.
 * @author Sean A. Irvine
 */
public class A007901 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C1 = RING.create(Arrays.asList(Q.ONE, new Q(-3), Q.ONE));
  private static final Polynomial<Q> C2 = RING.create(Arrays.asList(Q.NEG_ONE, Q.FIVE, Q.NEG_ONE, new Q(-6)));
  private static final Polynomial<Q> C3 = RING.create(Arrays.asList(Q.ONE, new Q(-7), new Q(14), new Q(-9)));
  private static final Polynomial<Q> D1 = RING.create(Arrays.asList(Q.ZERO, Q.FOUR));
  private int mN = -3;

  @Override
  public Z next() {
    if (++mN <= 0) {
      return Z.ZERO;
    }
    return RING.coeff(RING.add(RING.multiply(C1, RING.sqrt1m(D1, mN), mN), C2), C3, mN).toZ();
  }
}
