package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A394516 Number of rooted binary time-consistent leaf-labeled galled trees with n leaves.
 * @author Sean A. Irvine
 */
public class A394516 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Polynomial<Q> mA = RING.zero();

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = RING.add(
        RING.x(),
        RING.multiply(RING.multiply(mA, mA, mN), Q.HALF),
        RING.multiply(RING.multiply(mA, RING.pow(RING.series(mA, RING.subtract(RING.one(), mA), mN), 2, mN), mN), Q.HALF)
      );
    }
    return mA.coeff(mN).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}
