package irvine.oeis.a065;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065950 Bessel polynomial {y_n}'''(1).
 * @author Sean A. Irvine
 */
public class A065950 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    return RING.eval(RING.diff(RING.diff(RING.diff(PolynomialUtils.besselY(++mN)))), Q.ONE).toZ();
  }
}
