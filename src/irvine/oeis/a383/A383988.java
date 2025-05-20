package irvine.oeis.a383;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A383988 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A383988 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C1 = Polynomial.create(Q.ZERO, Q.FOUR);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final Polynomial<Q> p = RING.log(RING.multiply(RING.add(RING.one(), RING.sqrt1p(C1, mN)), Q.HALF), mN);
    final Polynomial<Q> e = RING.negate(RING.subtract(RING.one(), RING.exp(RING.x(), mN)));
    return RING.substitute(p, e, mN).coeff(mN).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}
