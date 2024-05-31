package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063039 LCM of unsigned Stirling numbers of the first kind, s(n,k) for 1 &lt;= k &lt;= n; s(n,k) = number of permutations of {1,2,..,n} with k cycles.
 * @author Sean A. Irvine
 */
public class A063039 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z lcm = Z.ONE;
    for (long k = 1; k <= mN; ++k) {
      lcm = lcm.lcm(Functions.STIRLING1.z(mN, k).abs());
    }
    return lcm;
  }
}
