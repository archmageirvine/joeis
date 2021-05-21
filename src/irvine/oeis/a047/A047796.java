package irvine.oeis.a047;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047796 a(n) = Sum_{k=0..n} Stirling1(n,k)^2.
 * @author Sean A. Irvine
 */
public class A047796 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(Stirling.firstKind(mN, k).square());
    }
    return sum;
  }
}
