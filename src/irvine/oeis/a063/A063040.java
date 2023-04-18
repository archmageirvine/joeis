package irvine.oeis.a063;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063040 LCM of Stirling numbers of the second kind, S(n,k) for 1 &lt;= k &lt;= n; S(n,k) = number of partitions of {1,2,...,n} with k blocks.
 * @author Sean A. Irvine
 */
public class A063040 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z lcm = Z.ONE;
    for (long k = 1; k <= mN; ++k) {
      lcm = lcm.lcm(Stirling.secondKind(mN, k));
    }
    return lcm;
  }
}
