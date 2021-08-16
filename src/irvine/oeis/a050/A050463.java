package irvine.oeis.a050;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050463 Sum_{d|n, n/d=1 mod 4} d^4.
 * @author Sean A. Irvine
 */
public class A050463 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      if (d.mod(4) == 1) {
        sum = sum.add(Z.valueOf(mN / d.longValue()).pow(4));
      }
    }
    return sum;
  }
}
