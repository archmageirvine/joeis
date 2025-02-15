package irvine.oeis.a075;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075225 Expansion of 2-AGM(1,1-8x) (where AGM denotes the arithmetic-geometric mean).
 * @author Sean A. Irvine
 */
public class A075225 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return RING.agm(RING.one(), RING.oneMinusXToTheN(Q.EIGHT, 1), mN).coeff(mN).toZ().negate();
  }
}
