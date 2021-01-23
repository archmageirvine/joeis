package irvine.oeis.a306;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A306347 Expansion of e.g.f. exp((sin(x) + sinh(x))/2).
 * @author Sean A. Irvine
 */
public class A306347 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return RING.exp(RING.divide(RING.add(RING.sin(RING.x(), mN), RING.sinh(RING.x(), mN)), Q.TWO), mN).coeff(mN).multiply(mF).toZ();
  }
}
