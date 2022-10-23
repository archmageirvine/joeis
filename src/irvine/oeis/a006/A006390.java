package irvine.oeis.a006;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006390 Number of unrooted loopless planar n-edge maps.
 * @author Sean A. Irvine
 */
public class A006390 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Binomial.binomial(4 * mN, mN).multiply(4 * mN + 1).multiply2().divide(mN + 1).divide(3 * mN + 1).divide(3 * mN + 2);
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final long d = dd.longValue();
      if (d != mN) {
        sum = sum.add(Binomial.binomial(4 * d, d).multiply(LongUtils.phi(mN / d)));
      }
    }
    sum = sum.add((mN & 1) == 0 ? Binomial.binomial(2 * mN, (mN - 2) / 2) : Binomial.binomial(2 * mN, (mN - 1) / 2).multiply(2 * mN).divide(mN + 1));
    return sum.divide(2 * mN);
  }
}
