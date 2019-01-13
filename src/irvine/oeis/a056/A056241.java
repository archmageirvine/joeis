package irvine.oeis.a056;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056241.
 * @author Sean A. Irvine
 */
public class A056241 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  private Z t(final long n, final long k) {
    Z sum = Z.ZERO;
    for (long j = 0; j < k; ++j) {
      sum = sum.add(Binomial.binomial(n - 1, 2 * k - j - 2).multiply(Binomial.binomial(2 * k - j - 2, j)));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
