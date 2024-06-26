package irvine.oeis.a024;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024418 a(n) = t mod s(n,n-1), where t = max{s(n,k): k=1,2,...,n}, s(n,k) = Stirling numbers of the second kind, n &gt;= 2.
 * @author Sean A. Irvine
 */
public class A024418 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ONE;
    for (long k = 2; k <= mN; ++k) {
      max = max.max(Functions.STIRLING2.z(mN, k));
    }
    return max.mod(Functions.STIRLING2.z(mN, mN - 1));
  }
}
