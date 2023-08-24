package irvine.oeis.a065;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065263 Infinite binary tree inspired permutation of N: 1 -&gt; 3, 11ab..yz -&gt; 11ab..yz1, 10ab..y0 -&gt; 10ab..y, 10ab..y1 -&gt; 11AB..Y0 (where 1AB..Y0 is the complement of 0ab..y1).
 * @author Sean A. Irvine
 */
public class A065263 extends Sequence1 {

  private long mN = 0;

  static Z compute(final long n) {
    if (n == 1) {
      return Z.THREE;
    }
    final long k = LongUtils.lg(n) - 1;
    if (n / (1L << k) == 3) {
      return Z.valueOf(2 * n + 1);
    }
    if ((n & 1) == 0) {
      return Z.valueOf(n / 2);
    }
    return Z.ONE.shiftLeft(k + 1).add(Z.ONE.shiftLeft(k + 2).subtract(1 + n));
  }

  @Override
  public Z next() {
    return compute(++mN);
  }
}
