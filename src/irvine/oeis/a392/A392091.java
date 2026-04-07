package irvine.oeis.a392;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A392091 Triangle read by rows: row n gives T(n,k) = Sum_{j=1..n} #{m &lt;= j : A001222(m)=k} for k=1..floor(log_2(n)).
 * @author Sean A. Irvine
 */
public class A392091 extends Sequence2 {

  private long mN = 2;
  private long mM = 0;

  private Z t(final long n, final long k) {
    Z sum = Z.ZERO;
    for (long m = 2; m <= n; ++m) {
      if (Functions.BIG_OMEGA.l(m) == k) {
        sum = sum.add(n - m + 1);
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > LongUtils.floorLog2(mN)) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
