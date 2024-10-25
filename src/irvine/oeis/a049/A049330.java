package irvine.oeis.a049;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049330 Numerator of (1/Pi)*Integral_{x=0..oo} (sin(x)/x)^n dx.
 * @author Sean A. Irvine
 */
public class A049330 extends Sequence1 {

  private Z mF = Z.FOUR;
  private long mN = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mN > 2) {
      mF = mF.multiply(mN - 1).multiply2();
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN / 2; ++k) {
      sum = sum.signedAdd((k & 1) == 0, Z.valueOf(mN - 2L * k).pow(mN - 1).multiply(Binomial.binomial(mN, k)));
    }
    return select(new Q(sum, mF));
  }
}
