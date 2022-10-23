package irvine.oeis.a000;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000358 Number of binary necklaces of length n with no subsequence 00, excluding the necklace "0".
 * @author Sean A. Irvine
 */
public class A000358 extends Sequence1 {

  protected int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      final int dd = d.intValue();
      sum = sum.add(Fibonacci.fibonacci(dd - 1).add(Fibonacci.fibonacci(dd + 1))
                    .multiply(LongUtils.phi(mN / dd)));
    }
    return sum.divide(mN);
  }
}
