package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007427 Moebius transform applied twice to sequence 1,0,0,0,....
 * @author Sean A. Irvine
 */
public class A007427 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final long d = dd.longValue();
      sum = sum.add((long) Functions.MOBIUS.i(d) * Functions.MOBIUS.i(mN / d));
    }
    return sum;
  }
}
