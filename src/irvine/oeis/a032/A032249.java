package irvine.oeis.a032;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.Mobius;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032249 "DHK[ 8 ]" (bracelet, identity, unlabeled, 8 parts) transform of 1,1,1,1,...
 * @author Sean A. Irvine
 */
public class A032249 implements Sequence {

  private long mN = 10;

  private long b(final long n, final long d) {
    return d == 8 ? n / d - 1 : n / d;
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(LongUtils.gcd(mN, 8)).divisors()) {
      final long d = dd.longValue();
      final int mu = Mobius.mobius(d);
      if (mu != 0) {
        sum = sum.signedAdd(mu == 1, Binomial.binomial(mN / d - 1, 8 / d - 1).subtract(Binomial.binomial(b(mN, d) / 2, 4 / d).multiply(8)));
      }
    }
    return sum.divide(16);
  }
}
