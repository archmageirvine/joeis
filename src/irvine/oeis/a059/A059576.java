package irvine.oeis.a059;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059576 Summatory Pascal triangle T(n,k) (0 &lt;= k &lt;= n) read by rows. Top entry is 1. Each entry is the sum of the parallelogram above it.
 * @author Sean A. Irvine
 */
public class A059576 implements Sequence {

  private int mN = -1;
  private int mM = 0;

  private Z u(final int n, final int m) {
    if (n == 0 && m == 0) {
      return Z.ONE;
    }
    return Integers.SINGLETON.sum(0, n + m, k -> Binomial.binomial(n, k - m + 1).multiply(Binomial.binomial(m, k - n + 1)).shiftLeft(k));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return u(mN - mM, mM);
  }
}

