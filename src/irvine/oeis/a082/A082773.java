package irvine.oeis.a082;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082773 Integers n such that there exists at least one divisor d of n, 1 &lt; d &lt; n, such that d divides n, d+1 divides n+1 and d+2 divides n+2.
 * @author Sean A. Irvine
 */
public class A082773 extends Sequence1 {

  private int mN = 13;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      for (final Z dd : Jaguar.factor(n).divisors()) {
        final long d = dd.longValue();
        if (d != 1 && d != mN && (mN + 1) % (d + 1) == 0 && (mN + 2) % (d + 2) == 0) {
          return n;
        }
      }
    }
  }
}
