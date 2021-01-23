package irvine.oeis.a037;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037027 Skew Fibonacci-Pascal triangle read by rows.
 * @author Sean A. Irvine
 */
public class A037027 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  protected Z t(final long n, final long m) {
    Z sum = Z.ZERO;
    for (long k = 0; k <= n - m; ++k) {
      sum = sum.add(Binomial.binomial(m + k, m).multiply(Binomial.binomial(k, n - k - m)));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }

}

