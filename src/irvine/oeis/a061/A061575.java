package irvine.oeis.a061;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061575 Number of planar planted trees with n non-root nodes and without isolated 2-valent nodes.
 * @author Sean A. Irvine
 */
public class A061575 extends Sequence0 {

  private int mN = -1;

  private static Z s(final int k) {
    Z sum = Z.ZERO;
    for (int j = 1; j <= k; ++j) {
      sum = sum.signedAdd(((j - k) & 1) == 0, Binomial.binomial(2L * j - 2, j - 1).multiply(Binomial.binomial(k, j)));
    }
    return sum;
  }

  private static Z t(final int n, final int k) {
    return Integers.SINGLETON.sum(0, (n - k) / 2, j -> Binomial.binomial(k, j).multiply(Binomial.binomial(n - k - j - 1, n - k - 2L * j)));
  }

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, ++mN, k -> s(k).multiply(t(mN, k)).divide(k));
  }
}
