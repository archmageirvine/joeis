package irvine.oeis.a047;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A047792 a(n) = Sum_{k=0..n} Stirling1(n,k)*Stirling2(n,k).
 * @author Sean A. Irvine
 */
public class A047792 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(Functions.STIRLING1.z(mN, k).multiply(Functions.STIRLING2.z(mN, k)));
    }
    return sum;
  }
}
