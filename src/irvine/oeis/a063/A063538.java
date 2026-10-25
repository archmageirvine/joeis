package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063538 Numbers k that are not sqrt(k-1)-smooth: largest prime factor of k (A006530(k)) &gt;= sqrt(k).
 * @author Sean A. Irvine
 */
public class A063538 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.GPF.z(++mN).square().longValueExact() >= mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
