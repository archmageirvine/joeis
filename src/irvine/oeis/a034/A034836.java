package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a038.A038548;
import irvine.oeis.memory.MemorySequence;

/**
 * A034836 Number of ways to write n as n = x*y*z with 1 &lt;= x &lt;= y &lt;= z.
 * @author Sean A. Irvine
 */
public class A034836 extends Sequence1 {

  // After Rick L. Shepherd

  private final MemorySequence mA038548 = MemorySequence.cachedSequence(new A038548());
  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    final Z n = Z.valueOf(++mN);
    for (final Z dd : Jaguar.factor(n).divisorsSorted()) {
      final int d = dd.intValue();
      if (dd.pow(3).compareTo(n) > 0) {
        break;
      }
      sum = sum.add(mA038548.a(mN / d - 1));
      for (final Z dd0 : Jaguar.factor(mN / d).divisorsSorted()) {
        final int d0 = dd0.intValue();
        if (d0 >= d) {
          break;
        }
        sum = sum.subtract(1);
      }
    }
    return sum;
  }
}
