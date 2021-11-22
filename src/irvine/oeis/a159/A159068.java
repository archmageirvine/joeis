package irvine.oeis.a159;
// manually sumsi/sumgcd at 2021-11-20 19:26

import irvine.math.LongUtils;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A159068 a(n) = Sum_{k=1..n} binomial(n,k) * gcd(k,n).
 * @author Georg Fischer
 */
public class A159068 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      final long gd = LongUtils.gcd(mN, k);
      sum = sum.add(Binomial.binomial(mN, k).multiply(gd));
    }
    return sum;
  }
}
