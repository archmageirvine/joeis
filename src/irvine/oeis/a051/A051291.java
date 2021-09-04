package irvine.oeis.a051;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051291 Whitney number of level n of the lattice of the ideals of the fence of order 2 n + 1.
 * @author Sean A. Irvine
 */
public class A051291 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C1 = RING.create(Arrays.asList(Q.ONE, new Q(-2), Q.NEG_ONE, new Q(-2), Q.ONE));
  private static final Polynomial<Q> C2 = RING.oneMinusXToTheN(1);
  private static final Polynomial<Q> C3 = RING.create(Arrays.asList(Q.ONE, Q.ZERO, Q.TWO, Q.NEG_ONE));
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Q> s = RING.sqrt(C1, mN + 1);
    return RING.coeff(RING.subtract(C3, RING.multiply(s, C2, mN + 1)),
      RING.multiply(s, Q.TWO).shift(1), mN).toZ();
  }
}
