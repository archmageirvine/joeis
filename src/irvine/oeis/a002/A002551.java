package irvine.oeis.a002;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Rationals;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002551.
 * @author Sean A. Irvine
 */
public class A002551 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;

  protected Q step() {
    ++mN;
    final Polynomial<Q> gf = RING.series(RING.pow(RING.log1p(RING.x(), mN), 2, mN), RING.sqrt1p(RING.x(), mN), mN);
    return gf.coeff(mN);
  }

  @Override
  public Z next() {
    return step().num();
  }
}
