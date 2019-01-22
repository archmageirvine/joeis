package irvine.oeis.a006;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.math.z.Fibonacci;
import irvine.math.Mobius;
import irvine.oeis.Sequence;

/**
 * A006206.
 * @author Sean A. Irvine
 */
public class A006206 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z s = Z.ZERO;
    for (final Z dd : Cheetah.factor(++mN).divisors()) {
      final int d = dd.intValue();
      s = s.add(Fibonacci.fibonacci(d + 1).add(Fibonacci.fibonacci(d - 1)).multiply(Mobius.mobius(mN / d)));
    }
    return s.divide(mN);
  }
}
