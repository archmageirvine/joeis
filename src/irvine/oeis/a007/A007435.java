package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007435 Inverse Moebius transform of Fibonacci numbers 1,1,2,3,5,8,...
 * @author Sean A. Irvine
 */
public class A007435 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      sum = sum.add(Functions.FIBONACCI.z(d));
    }
    return sum;
  }
}
