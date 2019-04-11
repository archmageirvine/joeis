package irvine.oeis.a008;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008961 Numerators of Taylor series for 1/(sin <code>x +</code> tan <code>x)</code>.
 * @author Sean A. Irvine
 */
public class A008961 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mN += 2;
    return select(RING.coeff(RING.x(), RING.add(RING.sin(RING.x(), mN + 1), RING.tan(RING.x(), mN + 1)), mN));
  }
}
