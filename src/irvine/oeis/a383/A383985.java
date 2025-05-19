package irvine.oeis.a383;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A383732 allocated for Guy Amit.
 * @author Sean A. Irvine
 */
public class A383985 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> NEG_X = RING.negate(RING.x());
  private final Polynomial<Q> mSum = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      mSum.add(Q.ZERO);
      return Z.ZERO;
    }
    mSum.add(new Q(Z.valueOf(-mN).pow(mN - 1), Functions.FACTORIAL.z(mN)));
    return RING.substitute(mSum, RING.subtract(RING.one(), RING.exp(NEG_X, mN)), mN).coeff(mN).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}
