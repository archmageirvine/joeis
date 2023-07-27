package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064775 Card{ k&lt;=n, k such that all prime divisors of k are &lt;= sqrt(k) }.
 * @author Sean A. Irvine
 */
public class A064775 extends Sequence1 {

  private long mN = 0;
  private long mCount = 0;

  @Override
  public Z next() {
    if (Jaguar.factor(++mN).largestPrimeFactor().longValueExact() <= LongUtils.sqrt(mN)) {
      ++mCount;
    }
    return Z.valueOf(mCount);
  }
}
