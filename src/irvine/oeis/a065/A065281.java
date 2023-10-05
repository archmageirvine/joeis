package irvine.oeis.a065;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065281 Infinite binary tree inspired permutation of N: 1 -&gt; 1, 11ab..yz -&gt; 11ab..yz1, 10ab..y1 -&gt; 10ab..y, 10ab..y0 -&gt; 11ab..y0.
 * @author Sean A. Irvine
 */
public class A065281 extends Sequence1 {

  private long mN = 0;

  static Z compute(final long n) {
    if (n == 1) {
      return Z.ONE;
    }
    final long k = LongUtils.log2(n) - 1;
    if (n / (1L << k) == 3) {
      return Z.valueOf(2 * n + 1);
    }
    if ((n & 1) == 1) {
      return Z.valueOf((n - 1) / 2);
    }
    return Z.ONE.shiftLeft(k).add(n);
  }

  @Override
  public Z next() {
    return compute(++mN);
  }
}
