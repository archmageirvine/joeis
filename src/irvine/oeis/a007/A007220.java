package irvine.oeis.a007;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007220 Almost-convex polygons of perimeter <code>2n</code> on square lattice.
 * @author Sean A. Irvine
 */
public class A007220 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> A = RING.create(Arrays.asList(Q.ZERO, Q.ZERO, Q.ZERO, new Q(16), new Q(-144), new Q(400), new Q(-368), new Q(48)));
  private static final Polynomial<Q> B = RING.create(Arrays.asList(Q.ZERO, Q.ZERO, Q.ZERO, new Q(-16), new Q(224), new Q(-1200), new Q(3092), new Q(-3892), new Q(2140), new Q(-360), new Q(96)));
  private static final Polynomial<Q> S = RING.oneMinusXToTheN(1);
  private static final Polynomial<Q> T = RING.oneMinusXToTheN(new Q(4), 1);
  private static final Polynomial<Q> C = RING.pow(T, 5);
  private static final Polynomial<Q> D = RING.multiply(S, RING.multiply(RING.create(Arrays.asList(Q.ONE, new Q(-3), Q.ONE)), RING.pow(T, 3)));

  private int mN = 5;

  @Override
  public Z next() {
    ++mN;
    final Q a = RING.coeff(A, RING.multiply(S, RING.sqrt(C, mN)), mN);
    final Q b = RING.coeff(B, D, mN);
    return a.add(b).toZ();
  }
}

