package irvine.oeis.a003;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003444 Number of dissections of a polygon.
 * @author Sean A. Irvine
 */
public class A003444 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (final Z dz : Cheetah.factor(LongUtils.gcd(2 * mN, mN - 2)).divisors()) {
      final long d = dz.longValueExact();
      s = s.add(Binomial.binomial(2 * mN / d, (mN - 2) / d).multiply(LongUtils.phi(d)));
    }
    return s.divide(2 * mN);
  }
}
