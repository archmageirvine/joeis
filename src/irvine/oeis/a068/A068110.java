package irvine.oeis.a068;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068110 Denominators of coefficients in J0(i*sqrt(x))^2 power series where J0 denotes the ordinary Bessel function of order 0.
 * @author Sean A. Irvine
 */
public class A068110 extends Sequence0 {

  private long mN = -1;
  private Z mF = Z.ONE;
  private Z mF2 = Z.ONE;

  protected Z select(final Q n) {
    return n.den();
  }

  @Override
  public Z next() {
    if (++mN >= 1) {
      mF = mF.multiply(Z.valueOf(mN).pow(4)).multiply(4);
      mF2 = mF2.multiply(2 * mN).multiply(2 * mN - 1);
    }
    return select(new Q(mF2, mF));
  }
}
