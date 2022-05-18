package irvine.oeis.a005;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005516 Number of n-bead bracelets (turnover necklaces) with 12 red beads.
 * @author Sean A. Irvine
 */
public class A005516 implements Sequence {

  private final int mK = beads();
  private int mN = mK - 1;

  protected int beads() {
    return 12;
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(LongUtils.gcd(mN, mK)).divisors()) {
      final int d = dd.intValueExact();
      sum = sum.add(Binomial.binomial(mN / d, mK / d).multiply(LongUtils.phi(d)));
    }
    sum = sum.divide(mN);
    sum = sum.add(Binomial.binomial(((mN & 1) == 1 ? mN - 1 : mN - ((mK & 1) == 1 ? 2 : 0)) / 2, mK / 2));
    return sum.divide2();
  }
}
