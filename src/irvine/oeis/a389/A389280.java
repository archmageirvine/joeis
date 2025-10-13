package irvine.oeis.a389;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A389280 a(n) is the least number k &gt; 0 such that wt(k^n) &gt;= wt(k) * T(n), or -1 if such k does not exist, where wt(x) = A000120(x) is the binary weight of x, and T(n) = n*(n+1)/2 = A000217(n) is the n-th triangular number.
 * @author Sean A. Irvine
 */
public class A389280 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final long t = Functions.TRIANGULAR.l(++mN);
    long k = 0;
    while (true) {
      if (Z.valueOf(++k).pow(mN).bitCount() >= t * Long.bitCount(k)) {
        return Z.valueOf(k);
      }
    }
  }
}
