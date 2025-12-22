package irvine.oeis.a082;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082772 Integers n such that there exists at least one divisor d of n, 1 &lt; d &lt; n, such that d divides n and d+1 divides n+1.
 * @author Sean A. Irvine
 */
public class A082772 extends Sequence1 {

  private int mN = 7;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      for (final Z d : Jaguar.factor(n).divisors()) {
        if (!d.isOne() && !d.equals(n) && (mN + 1) % (d.longValue() + 1) == 0) {
          return n;
        }
      }
    }
  }
}
