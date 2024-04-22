package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007436 Moebius transform of Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A007436 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Functions.FIBONACCI.z((long) d).multiply(Functions.MOBIUS.i((long) (mN / d))));
    }
    return sum;
  }
}
