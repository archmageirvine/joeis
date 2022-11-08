package irvine.oeis.a060;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060278 Sum of composite divisors of n less than n.
 * @author Sean A. Irvine
 */
public class A060278 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      if (!dd.isProbablePrime()) {
        final long d = dd.longValue();
        if (d > 1 && d < mN) {
          sum = sum.add(d);
        }
      }
    }
    return sum;
  }
}
