package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072514 Sum of n mod k for k in {1...n} with gcd(k,n) &gt; 1.
 * @author Sean A. Irvine
 */
public class A072514 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 2; k <= mN; ++k) {
      if (Functions.GCD.l(k, mN) > 1) {
        sum = sum.add(mN % k);
      }
    }
    return sum;
  }
}
