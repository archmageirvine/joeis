package irvine.oeis.a348;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A348061 a(n) = Sum_{k=1..n, gcd(n,k) = 1} n / gcd(n,k-1).
 * @author Georg Fischer
 */
public class A348061 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      if (LongUtils.gcd(k, mN) == 1) {
        sum = sum.add(mN / LongUtils.gcd(mN, k - 1));
      }
    }
    return sum;
  }
}
