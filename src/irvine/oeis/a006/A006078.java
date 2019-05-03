package irvine.oeis.a006;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006078 Number of triangulated <code>(n+2)-gons</code> rooted at an exterior edge.
 * @author Sean A. Irvine
 */
public class A006078 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> A = RING.create(Arrays.asList(new Q(4), new Q(-4), new Q(-4)));
  private static final Polynomial<Q> B = RING.create(Arrays.asList(Q.ONE, new Q(-2)));
  private static final Polynomial<Q> C = RING.monomial(new Q(-4), 1);
  private static final Polynomial<Q> D = RING.monomial(new Q(-4), 2);

  private int mN = 3;

  @Override
  public Z next() {
    ++mN;
    return RING.subtract(RING.subtract(A, RING.multiply(B, RING.sqrt1p(C, mN), mN)), RING.multiply(RING.sqrt1p(D, mN), Q.THREE)).coeff(mN).toZ().divide(8);
  }
}

