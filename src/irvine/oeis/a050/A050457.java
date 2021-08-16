package irvine.oeis.a050;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050457 a(n) = Sum_{ d divides n, d==1 mod 4} d - Sum_{ d divides n, d==3 mod 4} d.
 * @author Sean A. Irvine
 */
public class A050457 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      final long r = d.mod(4);
      if (r == 1) {
        sum = sum.add(d);
      } else if (r == 3) {
        sum = sum.subtract(d);
      }
    }
    return sum;
  }
}
