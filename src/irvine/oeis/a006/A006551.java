package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006551.
 * @author Sean A. Irvine
 */
public class A006551 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    final int m = ++mN / 2;
    for (int k = 0; k <= m; ++k) {
      sum = sum.signedAdd((k & 1) == 0, Binomial.binomial(mN + 1, k).multiply(Z.valueOf(m - k + 1).pow(mN)));
    }
    return sum;
  }
}
