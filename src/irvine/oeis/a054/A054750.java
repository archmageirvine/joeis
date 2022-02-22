package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A054750 Smallest prime number whose digits sum to n-th prime.
 * @author Sean A. Irvine
 */
public class A054750 extends A000040 {

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    long q = 1;
    while (true) {
      q = mPrime.nextPrime(q);
      if (ZUtils.digitSum(q) == p) {
        return Z.valueOf(q);
      }
    }
  }
}
