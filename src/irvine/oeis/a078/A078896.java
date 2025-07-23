package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078896 Number of times the smallest prime factor of n is a factor in all numbers &lt;= n; a(1) = 1.
 * @author Sean A. Irvine
 */
public class A078896 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1 || Predicates.PRIME.is(mN)) {
      return Z.ONE;
    }
    final long p = Functions.LPF.l(mN);
    long cnt = 0;
    for (long k = p; k <= mN; k += p) {
      cnt += Functions.VALUATION.i(k, p);
    }
    return Z.valueOf(cnt);
  }
}
