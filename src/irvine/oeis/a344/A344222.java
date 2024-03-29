package irvine.oeis.a344;
// Generated by gen_seq4.pl sumsi/sumgcd at 2021-11-20 22:12

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A344222 a(n) = Sum_{k=1..n} tau(gcd(k,n)^4), where tau(n) is the number of divisors of n.
 * @author Georg Fischer
 */
public class A344222 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      final long gd = LongUtils.gcd(mN, k);
      sum = sum.add(irvine.factor.factor.Jaguar.factor(Z.valueOf(gd).pow(4)).sigma0());
    }
    return sum;
  }
}
