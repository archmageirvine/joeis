package irvine.oeis.a383;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A383990 Series expansion of the exponential generating function exp(-dend(-x))-1 where dend(x) = (1 - sqrt(1+4*x)) / (2*x) + 1 (given by A000108).
 * @author Sean A. Irvine
 */
public class A383990 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C1 = Polynomial.create(Q.ZERO, Q.FOUR);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final Polynomial<Q> p = RING.add(RING.multiply(RING.subtract(RING.one(), RING.sqrt1p(C1, mN + 1)), Q.HALF).shift(-1), RING.one());
    return RING.exp(p, mN).coeff(mN).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}
