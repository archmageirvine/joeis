package irvine.oeis.a000;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.Fibonacci;
import irvine.oeis.Sequence;

/**
 * A000358 Number of binary necklaces of length n with no subsequence 00.
 * @author Sean A. Irvine
 */
public class A000358 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(mN).divisors()) {
      final int dd = d.intValue();
      sum = sum.add(Fibonacci.fibonacci(dd - 1).add(Fibonacci.fibonacci(dd + 1))
                    .multiply(LongUtils.phi(mN / dd)));
    }
    return sum.divide(mN);
  }
}
