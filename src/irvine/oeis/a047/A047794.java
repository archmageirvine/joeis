package irvine.oeis.a047;

import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047794 a(n) = Sum_{k=0..n} C(n,k)*|Stirling1(n,k)*Stirling2(n,k)|.
 * @author Sean A. Irvine
 */
public class A047794 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(Stirling.firstKind(mN, k).multiply(Stirling.secondKind(mN, k)).multiply(Binomial.binomial(mN, k)).abs());
    }
    return sum;
  }
}
