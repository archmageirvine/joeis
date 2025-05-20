package irvine.oeis.a383;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A383986 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A383986 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C2 = Polynomial.create(Q.TWO);
  private static final Polynomial<Q> C2X = Polynomial.create(Q.ZERO, Q.TWO);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final Polynomial<Q> e4 = RING.multiply(RING.exp(RING.x(), mN), Q.FOUR);
    final Polynomial<Q> e2 = RING.exp(C2X, mN);
    return RING.sqrt(RING.subtract(RING.subtract(e4, e2), C2), mN).coeff(mN).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}
