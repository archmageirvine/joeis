package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069828 Sum of positive integers k for k &lt;= n and gcd(k,n) = gcd(k+1,n).
 * @author Sean A. Irvine
 */
public class A069828 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    long g = 1;
    for (long k = 2; k <= mN; ++k) {
      final long d = Functions.GCD.l(k, mN);
      if (d == g) {
        sum = sum.add(k - 1);
      }
      g = d;
    }
    return sum;
  }
}

