package irvine.oeis.a337;
// manually sumsi/sumgcd1 at 2021-11-20 19:26

import irvine.math.LongUtils;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A337003 a(n) = Sum_{k=1..n, gcd(n,k) = 1} binomial(n,k)^2.
 * @author Georg Fischer
 */
public class A337003 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      final long gd = LongUtils.gcd(mN, k);
      if (gd == 1) {
        sum = sum.add(Binomial.binomial(mN, k).square());
      }
    }
    return sum;
  }
}
