package irvine.oeis.a055;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055363 Triangle of asymmetric mobiles (circular rooted trees) with n nodes and k leaves.
 * @author Sean A. Irvine
 */
public class A055363 extends Sequence1 {

  private static final PolynomialRingField<Q> RING_Y = new PolynomialRingField<>("y", Rationals.SINGLETON);
  private static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>(RING_Y);
  private static final Polynomial<Polynomial<Q>> Y = RING.monomial(RING_Y.x(), 0);
  private Polynomial<Polynomial<Q>> mGf = Y.shift(1);
  private int mN = 1;
  private int mM = 0;

  private void step() {
    Polynomial<Polynomial<Q>> sum = RING.zero();
    for (int k = 1; k <= mN; ++k) {
      final int m = Functions.MOBIUS.i((long) k);
      if (m != 0) {
        sum = RING.add(sum, RING.multiply(RING.log1p(RING.negate(PolynomialUtils.innerSubstitute(RING, mGf.substitutePower(k, mN), k, mN)), mN), RING_Y.monomial(new Q(m, k), 0)));
      }
    }
    mGf = RING.subtract(Y, sum).shift(1);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
      step();
    }
    return mGf.coeff(mN).coeff(mM).toZ();
  }
}
