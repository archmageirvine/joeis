package irvine.oeis.a038;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A038790 Circulant p^2-tournaments up to rotations only, indexed by odd primes p.
 * @author Sean A. Irvine
 */
public class A038790 extends A000040 {

  {
    super.next(); // skip 2
  }

  @Override
  public Z next() {
    final int p = super.next().intValueExact();
    Z sum1 = Z.ZERO;
    Z sum2 = Z.ZERO;
    for (final Z rr : Cheetah.factor(p - 1).divisors()) {
      if (rr.isOdd()) {
        final int r = rr.intValue();
        final int q = (p - 1) / r;
        final Z phi = Z.valueOf(LongUtils.phi(r));
        sum1 = sum1.add(phi.multiply(Z.ONE.shiftLeft((p + 1) * q / 2)));
        sum2 = sum2.add(phi.shiftLeft(q));
      }
    }
    sum1 = sum1.divide(p - 1);
    return sum1.add(sum2).divide(p);
  }
}
