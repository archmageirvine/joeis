package irvine.oeis.a001;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001895 Number of rooted planar 2-trees with n nodes.
 * @author Sean A. Irvine
 */
public class A001895 implements Sequence {

  private static final Q EIGHTH = new Q(1, 8);
  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> A = RING.create(Arrays.asList(Q.ZERO, new Q(4)));
  private static final Polynomial<Q> B = RING.create(Arrays.asList(Q.ZERO, Q.ZERO, new Q(4)));
  private static final Polynomial<Q> C = RING.create(Arrays.asList(new Q(4), Q.ZERO, new Q(-8)));
  private static final Polynomial<Q> D = RING.create(Arrays.asList(Q.THREE, Q.TWO));
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Q> p = RING.sqrt1m(A, mN + 2);
    final Polynomial<Q> q = RING.sqrt1m(B, mN + 2);
    final Polynomial<Q> r = RING.multiply(RING.shift(RING.subtract(RING.subtract(C, p), RING.multiply(q, D, mN + 2)), -2), EIGHTH);
    return r.coeff(mN).toZ();
  }
}
