package irvine.oeis.a333;
// manually sumsi/sumgcd at 2021-11-20 19:26

import irvine.math.LongUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A333465 a(n) = Sum_{k=1..n} ceiling(n/k) * gcd(n,k).
 * @author Georg Fischer
 */
public class A333465 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      final long gd = LongUtils.gcd(mN, k);
      sum = sum.add(new Q(mN, k).ceiling().multiply(gd));
    }
    return sum;
  }
}
