package irvine.oeis.a006;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006251 Number of n-element posets which are unions of 2 chains.
 * @author Sean A. Irvine
 */
public class A006251 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> A = RING.create(Arrays.asList(Q.ZERO, new Q(4)));
  private static final Polynomial<Q> B = RING.create(Arrays.asList(Q.ZERO, Q.ZERO, new Q(4)));
  private static final Polynomial<Q> C2 = RING.create(Arrays.asList(Q.TWO, Q.TWO.negate()));
  private static final Polynomial<Q> C4 = RING.create(Arrays.asList(new Q(4)));
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.coeff(C4, RING.add(RING.add(C2, RING.sqrt1m(A, mN)), RING.sqrt1m(B, mN)), mN).toZ();
  }
}
