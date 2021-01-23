package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006449 Row sums of Fibonacci-Pascal triangle in A045995.
 * @author Sean A. Irvine
 */
public class A006449 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Fibonacci.fibonacci(Binomial.binomial(mN, k).intValueExact()));
    }
    return sum;
  }
}
