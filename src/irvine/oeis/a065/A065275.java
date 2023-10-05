package irvine.oeis.a065;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065275 Infinite binary tree inspired permutation of N: 1 -&gt; 3, 11ab..yz -&gt; 11ab..yz0, 10ab..y0 -&gt; 10ab..y, 10ab..y1 -&gt; 11ab..y1.
 * @author Sean A. Irvine
 */
public class A065275 extends Sequence1 {

  private long mN = 0;

  static Z compute(final long n) {
    if (n == 1) {
      return Z.THREE;
    }
    final long k = LongUtils.log2(n) - 1;
    if (n / (1L << k) == 3) {
      return Z.valueOf(2 * n);
    }
    if ((n & 1) == 0) {
      return Z.valueOf(n / 2);
    }
    return Z.ONE.shiftLeft(k).add(n);
  }

  @Override
  public Z next() {
    return compute(++mN);
  }
}
