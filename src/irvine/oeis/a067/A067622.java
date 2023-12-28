package irvine.oeis.a067;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067622 Consider the power series (x + 1)^(1/3) = 1 + x/3-x^2/9 + 5x^3/81 + ...; sequence gives numerators of coefficients.
 * @author Sean A. Irvine
 */
public class A067622 extends Sequence0 {

  private long mN = -1;
  private Z mF = Z.ONE;
  private Q mK = Q.ONE_THIRD;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
      mK = mK.multiply(Q.ONE_THIRD.subtract(mN - 1));
    }
    return select(mK.divide(mF));
  }
}
