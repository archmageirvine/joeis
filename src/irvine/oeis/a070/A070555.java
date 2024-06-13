package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070555 Sum of positive integers k, where k &lt;= n and gcd(k,2n+1) = gcd(k+1,2n+1).
 * @author Sean A. Irvine
 */
public class A070555 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 1) {
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

