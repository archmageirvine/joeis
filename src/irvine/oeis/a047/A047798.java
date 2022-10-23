package irvine.oeis.a047;

import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A047798 a(n) = Sum_{k=0..n} C(n,k)*Stirling2(n,k)^2.
 * @author Sean A. Irvine
 */
public class A047798 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(Stirling.secondKind(mN, k).square().multiply(Binomial.binomial(mN, k)));
    }
    return sum;
  }
}
