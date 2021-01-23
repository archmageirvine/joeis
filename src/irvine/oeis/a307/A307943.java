package irvine.oeis.a307;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A307943 Number of evolutionary duplication-loss-histories of the complete binary species tree with 16 leaves.
 * @author Sean A. Irvine
 */
public class A307943 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Q FOUR = new Q(4);
  private static final Q SIX = new Q(6);
  private static final Polynomial<Q> CU = RING.create(Arrays.asList(new Q(-5), FOUR));
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Q> z4 = RING.monomial(FOUR, 1);
    final Polynomial<Q> t = RING.sqrt1m(z4, mN);
    final Polynomial<Q> t6 = RING.multiply(t, SIX);
    final Polynomial<Q> u = RING.sqrt(RING.add(t6, CU), mN);
    final Polynomial<Q> u6 = RING.multiply(u, SIX);
    final Polynomial<Q> v = RING.sqrt1p(RING.subtract(RING.subtract(u6, t6), z4), mN);
    final Polynomial<Q> v6 = RING.multiply(v, SIX);
    final Polynomial<Q> w = RING.sqrt(RING.add(RING.add(RING.subtract(v6, u6), t6), CU), mN);
    final Polynomial<Q> w6 = RING.multiply(w, SIX);
    final Polynomial<Q> gf = RING.multiply(RING.sqrt1p(RING.subtract(RING.subtract(RING.add(RING.subtract(w6, v6), u6), t6), z4), mN), Q.HALF);
    return gf.coeff(mN).toZ().negate();
  }
}
