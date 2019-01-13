package irvine.oeis.a317;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A317209.
 * @author Sean A. Irvine
 */
public class A317209 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    final Polynomial<Q> gf = RING.log(RING.series(RING.asin(RING.x(), mN + 1), RING.log1p(RING.x(), mN + 1), mN), mN);
    //System.out.println(gf);
    return gf.coeff(mN).multiply(mF).toZ();
  }
}
