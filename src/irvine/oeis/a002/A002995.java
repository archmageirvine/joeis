package irvine.oeis.a002;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002995 Number of unlabeled planar trees (also called plane trees) with n nodes.
 * @author Sean A. Irvine
 */
public class A002995 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 3) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    for (final Z d : Jaguar.factor(mN - 1).divisors()) {
      s = s.add(Binomial.binomial(d.multiply2(), d).multiply(LongUtils.phi((mN - 1) / d.longValue())));
    }
    s = s.divide(2 * (mN - 1));
    s = s.subtract(Binomial.catalan(mN - 1).divide2());
    if ((mN & 1) == 0) {
      s = s.add(Binomial.catalan(mN / 2 - 1).divide2());
    }
    return s;
  }
}
