package irvine.oeis.a057;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057475 Number of k, 1 &lt;= k &lt;= n, such that gcd(n,k) = gcd(n+1,k) = 1.
 * @author Sean A. Irvine
 */
public class A057475 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 1; k <= mN; ++k) {
      if (Functions.GCD.l(mN, k) == 1 && Functions.GCD.l(mN + 1, k) == 1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
