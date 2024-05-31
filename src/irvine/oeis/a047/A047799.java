package irvine.oeis.a047;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A047799 a(n) = Sum_{k=0..n} C(n,k)*Stirling1(n,k)^2.
 * @author Sean A. Irvine
 */
public class A047799 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(Functions.STIRLING1.z(mN, k).square().multiply(Binomial.binomial(mN, k)));
    }
    return sum;
  }
}
