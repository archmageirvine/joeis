package irvine.oeis.a039;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039759 Number of edges in the Hasse diagrams for the B-analogs of the partition lattices.
 * @author Sean A. Irvine
 */
public class A039759 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> TWO_X = RING.monomial(Q.TWO, 1);
  private static final Polynomial<Q> FOUR_X = RING.monomial(new Q(4), 1);
  private static final Polynomial<Q> C = RING.create(Arrays.asList(Q.HALF.negate(), Q.ONE));

  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    final Polynomial<Q> a = RING.multiply(RING.exp(TWO_X, mN), Q.HALF);
    final Polynomial<Q> b = RING.exp(RING.add(a, C), mN);
    final Polynomial<Q> c = RING.subtract(RING.exp(FOUR_X, mN), RING.one());
    return RING.multiply(b, c, mN).coeff(mN).multiply(mF).toZ().divide(4);
  }
}

