package irvine.oeis.a348;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A348060 a(n) = Sum_{k=1..n, gcd(n,k) = 1} (k-1) / gcd(n,k-1).
 * @author Georg Fischer
 */
public class A348060 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      if (LongUtils.gcd(k, mN) == 1) {
        sum = sum.add((k - 1) / LongUtils.gcd(mN, k - 1));
      }
    }
    return sum;
  }
}
