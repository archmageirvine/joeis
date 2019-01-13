package irvine.oeis.a013;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013926.
 * @author Sean A. Irvine
 */
public class A013926 implements Sequence {

  private int mN = 0;

  private Z t(final int n, final int k) {
    if (k == 0) {
      return Z.valueOf(n).pow(2 * n);
    } else {
      final Z t = Binomial.binomial(2L * n - 1, k - 1).multiply(Z.valueOf(n - k).pow(2 * n + 1)).multiply2().divide(k);
      return (k & 1) == 0 ? t : t.negate();
    }
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(t(mN, k));
    }
    return sum.multiply(mN);
  }
}
