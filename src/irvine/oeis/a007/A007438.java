package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007438 Moebius transform of triangular numbers.
 * @author Sean A. Irvine
 */
public class A007438 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      sum = sum.add(d.multiply(d.add(1)).divide2().multiply(Functions.MOBIUS.i(mN / d.longValue())));
    }
    return sum;
  }
}
