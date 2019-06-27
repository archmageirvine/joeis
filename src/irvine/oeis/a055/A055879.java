package irvine.oeis.a055;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055879 Least nondecreasing sequence with <code>a(1) = 1</code> and Hankel transform <code>{1,1,1,1,...}</code>.
 * @author Sean A. Irvine
 */
public class A055879 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> DEN = RING.create(Arrays.asList(Q.ZERO, Q.TWO.negate(), Q.TWO));
  private static final Polynomial<Q> S = RING.create(Arrays.asList(Q.ZERO, Q.ZERO, new Q(-6), Q.ZERO, new Q(5)));
  private static final Polynomial<Q> C = RING.create(Arrays.asList(Q.NEG_ONE, Q.ZERO, Q.ONE));

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return RING.coeff(RING.add(C, RING.sqrt1p(S, mN + 2)), DEN, mN).toZ();
  }
}
