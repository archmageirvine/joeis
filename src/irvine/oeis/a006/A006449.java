package irvine.oeis.a006;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006449 Row sums of Fibonacci-Pascal triangle in A045995.
 * @author Sean A. Irvine
 */
public class A006449 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Functions.FIBONACCI.z(Binomial.binomial(mN, k)));
    }
    return sum;
  }
}
