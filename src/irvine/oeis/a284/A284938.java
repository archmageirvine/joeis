package irvine.oeis.a284;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A284938 Triangle read by rows: coefficients of the edge cover polynomial for the n-path graph P_n.
 * @author Sean A. Irvine
 */
public class A284938 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  private Z t(final long n, final long m) {
    if (n < m) {
      return Z.ZERO;
    }
    if (n == 0 && m == 0) {
      return Z.ZERO;
    }
    if (m < n / 2 + 1) {
      return Z.ZERO;
    }
    return Binomial.binomial(m - 1, n - m);
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
