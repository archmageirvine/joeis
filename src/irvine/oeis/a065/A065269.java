package irvine.oeis.a065;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065269 Infinite binary tree inspired permutation of N: 1 -&gt; 1, 11ab..yz -&gt; 11ab..yz0, 10ab..y1 -&gt; 10ab..y, 10ab..y0 -&gt; 11AB..Y1 (where 1AB..Y1 is the complement of 0ab..y0).
 * @author Sean A. Irvine
 */
public class A065269 extends Sequence1 {

  private long mN = 0;

  static Z compute(final long n) {
    if (n == 1) {
      return Z.ONE;
    }
    final long k = LongUtils.log2(n) - 1;
    if (n / (1L << k) == 3) {
      return Z.valueOf(2 * n);
    }
    if ((n & 1) == 1) {
      return Z.valueOf((n - 1) / 2);
    }
    return Z.ONE.shiftLeft(k + 1).add(Z.ONE.shiftLeft(k + 2).subtract(1 + n));
  }

  @Override
  public Z next() {
    return compute(++mN);
  }
}
