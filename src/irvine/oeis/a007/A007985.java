package irvine.oeis.a007;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007985 Co-growth function of a certain group.
 * @author Sean A. Irvine
 */
public class A007985 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C = RING.onePlusXToTheN(1);
  private static final Polynomial<Q> D = RING.create(Arrays.asList(Q.ONE, new Q(-3), Q.THREE, new Q(-9)));
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return RING.coeff(RING.multiply(C, RING.sqrt1m(RING.x(), mN), mN), RING.sqrt(D, mN), mN).toZ();
  }
}
