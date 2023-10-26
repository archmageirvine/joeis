package irvine.oeis.a096;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A100960.
 * @author Sean A. Irvine
 */
public class A096332 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> HALF_X2 = RING.monomial(Q.HALF, 2);
  private final Sequence mA = new A096331();
  private final Polynomial<Q> mB = RING.empty();
  {
    mB.add(Q.ZERO);
    mB.add(Q.ZERO);
    mB.add(Q.ZERO);
  }
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    mB.add(new Q(mA.next()));
    final Polynomial<Q> b = RING.add(HALF_X2, RING.hadamardMultiply(mB, RING.exp(RING.x(), mN)));
    return RING.serlaplace(RING.integrate(RING.reversion(RING.series(RING.x(), RING.exp(RING.diff(b), mN), mN), mN).shift(-1))).coeff(mN).toZ();
  }
}
