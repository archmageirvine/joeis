package irvine.oeis.a005;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005770.
 * @author Sean A. Irvine
 */
public class A005770 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> NUM = RING.create(Arrays.asList(Q.ONE, new Q(-3), Q.TWO, Q.ONE));
  private static final Polynomial<Q> DEN = RING.create(Arrays.asList(Q.ONE, new Q(-12), new Q(55), new Q(-120), new Q(125), new Q(-54), new Q(8)));
  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(NUM, DEN, ++mN).toZ();
  }
}
