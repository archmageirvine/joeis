package irvine.oeis.a003;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003703.
 * @author Sean A. Irvine
 */
public class A003703 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Z mF = Z.ONE;
  protected int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    final Polynomial<Q> gf = RING.cos(RING.log1p(RING.x(), mN), mN);
    return gf.coeff(mN).multiply(mF).toZ();
  }
}
