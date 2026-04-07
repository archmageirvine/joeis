package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A393910 Smallest prime\u202fp for which,\u202ffor every i with 1 &lt;= i &lt;= n, the numbers p - i and p + i have the same number of divisors.
 * @author Sean A. Irvine
 */
public class A393910 extends A000040 {

  private long mN = 0;
  private long mLen = 0;
  private Z mP = Z.ZERO;

  private long length(final Z k) {
    long len = 0;
    while (Functions.SIGMA0.l(k.subtract(len + 1)) == Functions.SIGMA0.l(k.add(len + 1))) {
      ++len;
    }
    return len;
  }

  @Override
  public Z next() {
    ++mN;
    while (mN > mLen) {
      mP = super.next();
      mLen = length(mP);
    }
    return mP;
  }
}
