package irvine.oeis.a047;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047687 Numerators of coefficients in Taylor series for exp(sin(x)).
 * @author Sean A. Irvine
 */
public class A047687 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    return select(RING.exp(RING.sin(RING.x(), ++mN), mN).coeff(mN));
  }
}
