package irvine.oeis.a033;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033832 Sum of odd divisors of n &lt; sqrt(n) = sum of even divisors of n &lt; sqrt(n).
 * @author Sean A. Irvine
 */
public class A033832 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      Z sum = Z.ZERO;
      final long s = Functions.SQRT.l(mN);
      for (final Z dd : Jaguar.factor(++mN).divisors()) {
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
