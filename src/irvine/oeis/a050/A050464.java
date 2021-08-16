package irvine.oeis.a050;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050464 a(n) = Sum_{d divides n, n/d=3 mod 4} d.
 * @author Sean A. Irvine
 */
public class A050464 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      if (d.mod(4) == 3) {
        sum = sum.add(mN / d.longValue());
      }
    }
    return sum;
  }
}
