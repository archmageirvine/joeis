package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.group.PolynomialRingField;
import irvine.math.q.Rationals;
import irvine.math.q.Q;

/**
 * A002207 Denominators of logarithmic numbers (also of Gregory coefficients <code>G(n))</code>.
 * @author Sean A. Irvine
 */
public class A002207 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.coeff(RING.x(), RING.log1p(RING.x(), mN + 1), mN).den();
  }
}
