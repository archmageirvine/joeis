package irvine.oeis.a046;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A046976 Numerators of Taylor series for sec(x) = 1/cos(x).
 * @author Sean A. Irvine
 */
public class A046976 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  protected int mN = -2;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mN += 2;
    return select(RING.sec(RING.x(), mN).coeff(mN));
  }
}
