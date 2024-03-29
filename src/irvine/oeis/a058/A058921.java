package irvine.oeis.a058;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058921 a(n) = round((6*n)!/( 2^(3*n)*(3*n)!*6^(2*n) )).
 * @author Sean A. Irvine
 */
public class A058921 extends Sequence0 {

  private Q mA = Q.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(6L * mN).multiply(6L * mN - 1).multiply(6L * mN - 2).multiply(6L * mN - 3).multiply(6L * mN - 4).multiply(6L * mN - 5)
        .divide(Z.valueOf(3L * mN).multiply(3L * mN - 1).multiply(3L * mN - 2).multiply(288));
    }
    return mA.round();
  }
}
