package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079786 Triangle read by rows in which the n-th row begins with n and contains tau(n) numbers. The r-th term from right is the largest number &lt; n with r divisors, for 1&lt;= r &lt;= tau(n).
 * @author Sean A. Irvine
 */
public class A079786 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    while (true) {
      if (--mM <= 0) {
        mM = Functions.SIGMA0.l(++mN);
        return Z.valueOf(mN);
      }
      long k = mN;
      while (k > 1) {
        if (Functions.SIGMA0.l(--k) == mM) {
          return Z.valueOf(k);
        }
      }
    }
  }
}

