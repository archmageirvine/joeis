package irvine.oeis.a211;
// manually sumsi/sumgcd at 2021-11-20 20:50

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A211932 a(n) = Sum_{ m=1..n and gcd(n,m)&gt;1 } tau(m), where tau is the number of divisors function, A000005.
 * @author Georg Fischer
 */
public class A211932 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      final long gd = Functions.GCD.l(mN, k);
      if (gd > 1) {
        sum = sum.add(Functions.SIGMA0.z(k));
      }
    }
    return sum;
  }
}
