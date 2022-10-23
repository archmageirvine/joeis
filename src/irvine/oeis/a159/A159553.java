package irvine.oeis.a159;
// manually sumsi/sumgcd at 2021-11-20 19:26

import irvine.math.LongUtils;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A159553 a(n) = Sum_{k=0..n} binomial(n,k) * gcd(n,k).
 * For the purpose of this sequence, gcd(n, 0) = n.
 * @author Georg Fischer
 */
public class A159553 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      final long gd = k == 0 ? mN : LongUtils.gcd(mN, k);
      sum = sum.add(Binomial.binomial(mN, k).multiply(gd));
    }
    return sum;
  }
}
