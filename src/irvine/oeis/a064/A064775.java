package irvine.oeis.a064;

import irvine.math.function.Functions;
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
    if (Functions.GPF.l(++mN) <= Functions.SQRT.l(mN)) {
      ++mCount;
    }
    return Z.valueOf(mCount);
  }
}
