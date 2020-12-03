package irvine.oeis.a033;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033832 Sum of odd divisors of n &lt; sqrt(n) = sum of even divisors of n &lt; sqrt(n).
 * @author Sean A. Irvine
 */
public class A033832 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      Z sum = Z.ZERO;
      final long s = LongUtils.sqrt(mN);
      for (final Z dd : Cheetah.factor(++mN).divisors()) {
        final long d = dd.longValue();
        if (d <= s) {
          sum = sum.signedAdd(dd.isEven(), dd);
        }
      }
      if (sum.isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
