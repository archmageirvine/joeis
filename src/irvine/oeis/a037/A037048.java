package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037048 Number of pairs {i,j}, i&gt;1, j&gt;1, such that ij &lt; n^2.
 * @author Sean A. Irvine
 */
public class A037048 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    final Z s = Z.valueOf(++mN).square().subtract(1);
    Z sum = Z.ZERO;
    for (long k = 2; k <= mN; ++k) {
      sum = sum.add(s.divide(k).add(1 - k));
    }
    return sum;
  }
}
