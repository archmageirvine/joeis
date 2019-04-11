package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007435 Inverse Moebius transform of Fibonacci numbers <code>1,1,2,3,5,8,</code>...
 * @author Sean A. Irvine
 */
public class A007435 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      sum = sum.add(Fibonacci.fibonacci(d.intValueExact()));
    }
    return sum;
  }
}
