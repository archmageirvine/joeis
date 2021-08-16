package irvine.oeis.a050;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050467 Sum_{d|n, n/d=3 mod 4} d^4.
 * @author Sean A. Irvine
 */
public class A050467 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      if (d.mod(4) == 3) {
        sum = sum.add(Z.valueOf(mN / d.longValue()).pow(4));
      }
    }
    return sum;
  }
}
