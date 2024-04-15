package irvine.oeis.a161;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A161661 a(1)=1. a(n) = smallest multiple of {number of divisors of a(n-1)} that is &gt;= n.
 * @author Sean A. Irvine
 */
public class A161661 extends Sequence1 {

  private long mPrev = 1;
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      final long sigma0 = Functions.SIGMA0.l(mPrev);
      mPrev = sigma0 * ((mN + sigma0 - 1) / sigma0);
    }
    return Z.valueOf(mPrev);
  }
}

