package irvine.oeis.a386;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A386546 Numbers k &gt;= 1 such that k = d(k) + d(k+1) + ... + d(k+r) for some r &gt;= 0 where d(i) is the number of divisors of i (A000005).
 * @author Sean A. Irvine
 */
public class A386546 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      long sum = 0;
      long k = mN;
      while (sum < mN) {
        sum += Functions.SIGMA0.l(k++);
      }
      if (sum == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}

