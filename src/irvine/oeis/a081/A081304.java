package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081304 Number of numbers m &lt;= n with prime factors less than 2*spf(m), where spf(m) is the smallest prime factor of m (A020639).
 * @author Sean A. Irvine
 */
public class A081304 extends Sequence1 {

  private long mN = 0;
  private long mCount = 0;

  @Override
  public Z next() {
    if (Functions.LPF.l(++mN) * 2 > Functions.GPF.l(mN)) {
      ++mCount;
    }
    return Z.valueOf(mCount);
  }
}

