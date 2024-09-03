package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072108 Least k such that sum(i=1,k,gcd(k,i)) = n * sigma(k).
 * @author Sean A. Irvine
 */
public class A072108 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      ++k;
      Z sum = Z.ZERO;
      for (long j = 1; j <= k; ++j) {
        sum = sum.add(Functions.GCD.l(j, k));
      }
      if (sum.equals(Functions.SIGMA1.z(k).multiply(mN))) {
        return Z.valueOf(k);
      }
    }
  }
}
