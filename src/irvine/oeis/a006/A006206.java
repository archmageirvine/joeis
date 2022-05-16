package irvine.oeis.a006;

import irvine.factor.factor.Jaguar;
import irvine.math.Mobius;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006206 Number of aperiodic binary necklaces of length n with no subsequence 00, excluding the necklace "0".
 * @author Sean A. Irvine
 */
public class A006206 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z s = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      s = s.add(Fibonacci.fibonacci(d + 1).add(Fibonacci.fibonacci(d - 1)).multiply(Mobius.mobius(mN / d)));
    }
    return s.divide(mN);
  }
}
